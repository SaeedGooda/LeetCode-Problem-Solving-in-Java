class Solution {
    Map<String, Map<String, Double>> graph = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] results = new double[queries.size()];
        buildGraph(equations, values);
        for (int i = 0; i < queries.size(); i++) {
            results[i] = evaluate(queries.get(i).get(0), queries.get(i).get(1), new HashSet<>());
        }
        return results;
    }
    private void buildGraph(List<List<String>> equations, double[] values) {
        for (int i = 0; i < equations.size(); i++) {
            // Euqation = [X, Y]
            String X = equations.get(i).get(0);
            String Y = equations.get(i).get(1);
            double value = values[i];
                
            graph.putIfAbsent(X, new HashMap<>());
            graph.putIfAbsent(Y, new HashMap<>());
                
            graph.get(X).put(Y, value);
            graph.get(Y).put(X, 1.0 / value);
        }
    }
    private double evaluate(String start, String end, Set<String> visited) {
        if (!graph.containsKey(start) || !graph.containsKey(end)) {
            return -1.0;
        }
        
        if (start.equals(end)) {
            return 1.0;
        }
        
        visited.add(start);
        
        for (Map.Entry<String, Double> neighbor : graph.get(start).entrySet()) {
            if (!visited.contains(neighbor.getKey())) {
                double productWeight = evaluate(neighbor.getKey(), end, visited);
                if (productWeight != -1.0) {
                    return neighbor.getValue() * productWeight;
                }
            }
        }
        
        return -1.0;
    }

}