import java.util.PriorityQueue;

public class HeapForObject {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int CompareTo(Student s2){
            return this.rank-s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
       
        pq.add(new Student("A", 32));
        pq.add(new Student("B", 37));
        pq.add(new Student("D", 28));
        pq.add(new Student("C", 17));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"--->"+pq.peek().rank);
            pq.remove();
        }
    }
}
