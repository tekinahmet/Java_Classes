package day22collections_maps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01Queue {
 /*
1. Whenever you need FIFO scenarios, remember the use "Queue"s
2. You have 2 options to use "Queue"s:
        i. LinkedList: uses insertion order
        ii. PriorityQueue: uses priority order
3. Deque is an interface standing for double-ended queue,
use it whenever you need work with FIFO and LIFO
 */
    public static void main(String[] args) {
        Queue<String> food = new LinkedList<>();
            food.add("Meat");
            food.add("Cheese");
            food.add("Egg");
            food.add("Fruit");
            food.add("Candy");
        System.out.println(food);//[Meat, Cheese, Egg, Fruit, Candy]

        Queue<String> f = new PriorityQueue<>();
            f.add("Meat");
            f.add("Cheese");
            f.add("Egg");
            f.add("Fruit");
            f.add("Candy");
        System.out.println(f);//[Candy, Cheese, Egg, Meat, Fruit]

        Deque<String> g = new LinkedList<>();
            g.addFirst("A");
            g.addFirst("B");
            g.add("X");
            g.addLast("Y");
            g.addFirst("X");
            g.addFirst("A");
        System.out.println(g);//[A, X, B, A, X, Y]

            g.removeFirst();
        System.out.println(g);//[X, B, A, X, Y]
            g.removeFirstOccurrence("X");
        System.out.println(g);//[B, A, X, Y]
            g.getFirst();
        System.out.println(g);//[B, A, X, Y]


    }
}
