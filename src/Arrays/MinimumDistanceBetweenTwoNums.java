package Arrays;

class GFG{

    public static void main(String[] args) {
        int[] a = { 86, 39, 90, 67, 84, 66, 62 };
        int n = a.length;
        int x = 63;
        int y = 86;
        System.out.println(minDist(a, n, x, y));
    }

    static int minLength(int distance, int minDistance) {
        return (minDistance > 0 && minDistance < distance) ? minDistance : distance;
    }

    static int minDist(int a[], int n, int x, int y) {
        int distance = -1;
        int minDistance = 0;
        int prevVal = 0;
        int twoInputs = 0;

        for(int i = 0; i < n; i++) {
            if(a[i] == x || a[i] == y) {
                if(prevVal == 0) {
                    prevVal = a[i];
                    twoInputs += 1;
                    distance = 0;
                } else if(prevVal == a[i]) {
                    distance = 0;
                } else if(prevVal != a[i]) {
                    distance += 1;
                    prevVal = a[i];
                    twoInputs += 1;
                    minDistance = minLength(distance, minDistance);
                    distance = 0;
                }
            } else if(distance >= 0){
                distance += 1;
            }
        }

        return (twoInputs < 2) ? -1 : minDistance;
    }
}
