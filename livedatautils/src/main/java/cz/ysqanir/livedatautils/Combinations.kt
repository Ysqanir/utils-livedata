package cz.ysqanir.livedatautils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

/**
 * Collection of combination utils for LiveData
 *
 * @author Vojtěch Šimša - simsavojtech1@gmail.com
 */
class Combinations {
    companion object {
        /**
         * Simplified version of two-stream combination, returning Pair object without further processing
         * @param a stream of A
         * @param b stream of B
         * @return stream of Pair<A,B>
         * @see #combineLatest( LiveData<A>,LiveData<B>,(a: A, b: B) -> T)
         */
        fun <A, B> combineLatest(
                a: LiveData<A>,
                b: LiveData<B>) = combineLatest(a, b) { a, b -> Pair(a, b) }

        /**
         * Simplified version of three-stream combination, returning Triple object without further processing
         * @param a stream of A
         * @param b stream of B
         * @param c stream of C
         * @return stream of Triple<A,B,C>
         * @see #combineLatest( LiveData<A>,LiveData<B>,LiveData<C>,(a: A, b: B, c:C) -> T)
         */
        fun <A, B, C> combineLatest(
                a: LiveData<A>,
                b: LiveData<B>,
                c: LiveData<C>): LiveData<Triple<A, B, C>> = combineLatest(a, b, c) { a, b, c -> Triple(a, b, c) }

        /**
         * Combine latest values of provided streams using combinator as result parser.
         * Will not emit anything until all source streams have emitted at least one item.
         * @param a stream of A
         * @param b stream of B
         * @param b stream of C
         * @param combinator:(a:A,b:B,c:C)->T logic for parsing values A,B,C to resulting type T
         * @return stream of T as defined by combinator
         */
        fun <A, B, T> combineLatest(
                a: LiveData<A>,
                b: LiveData<B>,
                combinator: (a: A, b: B) -> T): LiveData<T> =
                MediatorLiveData<T>().apply {
                    var lastA: A? = null
                    var lastB: B? = null

                    fun update() {
                        val localLastA = lastA
                        val localLastB = lastB
                        if (localLastA != null && localLastB != null)
                            postValue(combinator.invoke(localLastA, localLastB))
                    }

                    addSource(a) {
                        lastA = it
                        update()
                    }
                    addSource(b) {
                        lastB = it
                        update()
                    }
                }

        /**
         * Combine latest values of provided streams using combinator as result parser.
         * Will not emit anything until all source streams have emitted at least one item.
         * @param a stream of A
         * @param b stream of B
         * @param c stream of C
         * @param combinator:(a:A,b:B,c:C)->T logic for parsing values A,B,C to resulting type T
         * @return stream of T as defined by combinator
         */
        fun <A, B, C, T> combineLatest(
                a: LiveData<A>,
                b: LiveData<B>,
                c: LiveData<C>,
                combinator: (a: A, b: B, c: C) -> T): LiveData<T> =
                MediatorLiveData<T>().apply {
                    var lastA: A? = null
                    var lastB: B? = null
                    var lastC: C? = null

                    fun update() {
                        val localLastA = lastA
                        val localLastB = lastB
                        val localLastC = lastC
                        if (localLastA != null && localLastB != null && localLastC != null)
                            postValue(combinator(localLastA, localLastB, localLastC))
                    }

                    addSource(a) {
                        lastA = it
                        update()
                    }
                    addSource(b) {
                        lastB = it
                        update()
                    }
                    addSource(c) {
                        lastC = it
                        update()
                    }
                }

        /**
         * Combine latest values of provided streams using combinator as result parser.
         * Will not emit anything until all source streams have emitted at least one item.
         * @param a stream of A
         * @param b stream of B
         * @param c stream of C
         * @param d stream of D
         * @param combinator:(a:A,b:B,c:C,d:D)->T logic for parsing values A,B,C,D to resulting type T
         * @return stream of T as defined by combinator
         */
        fun <A, B, C, D, T> combineLatest(a: LiveData<A>,
                                          b: LiveData<B>,
                                          c: LiveData<C>,
                                          d: LiveData<D>,
                                          combinator: (a: A, b: B, c: C, d: D) -> T): LiveData<T> =
                MediatorLiveData<T>().apply {
                    var lastA: A? = null
                    var lastB: B? = null
                    var lastC: C? = null
                    var lastD: D? = null

                    fun update() {
                        val localLastA = lastA
                        val localLastB = lastB
                        val localLastC = lastC
                        val localLastD = lastD

                        if (localLastA != null && localLastB != null && localLastC != null && localLastD != null)
                            postValue(combinator(localLastA, localLastB, localLastC, localLastD))
                    }
                    addSource(a) {
                        lastA = it
                        update()
                    }
                    addSource(b) {
                        lastB = it
                        update()
                    }
                    addSource(c) {
                        lastC = it
                        update()
                    }
                    addSource(d) {
                        lastD = it
                        update()
                    }
                }

        /**
         * Combine latest values of provided streams using combinator as result parser.
         * Will not emit anything until all source streams have emitted at least one item.
         * @param a stream of A
         * @param b stream of B
         * @param c stream of C
         * @param d stream of D
         * @param e stream of E
         * @param combinator:(a:A,b:B,c:C,d:D,e:E)->T logic for parsing values A,B,C,D,E to resulting type T
         * @return stream of T as defined by combinator
         */
        fun <A, B, C, D, E, T> combineLatest(a: LiveData<A>,
                                             b: LiveData<B>,
                                             c: LiveData<C>,
                                             d: LiveData<D>,
                                             e: LiveData<E>,
                                             combinator: (a: A, b: B, c: C, d: D, e: E) -> T): LiveData<T> =
                MediatorLiveData<T>().apply {
                    var lastA: A? = null
                    var lastB: B? = null
                    var lastC: C? = null
                    var lastD: D? = null
                    var lastE: E? = null


                    fun update() {
                        val localLastA = lastA
                        val localLastB = lastB
                        val localLastC = lastC
                        val localLastD = lastD
                        val localLastE = lastE

                        if (localLastA != null && localLastB != null && localLastC != null && localLastD != null && localLastE != null)
                            postValue(combinator(localLastA, localLastB, localLastC, localLastD, localLastE))
                    }
                    addSource(a) {
                        lastA = it
                        update()
                    }
                    addSource(b) {
                        lastB = it
                        update()
                    }
                    addSource(c) {
                        lastC = it
                        update()
                    }
                    addSource(d) {
                        lastD = it
                        update()
                    }
                    addSource(e) {
                        lastE = it
                        update()
                    }
                }

        /**
         * Combine provided streams, emitting latest value
         * @param source vararg of sources to combine
         * @return stream emitting latest value from given sources
         */
        fun <T> lastValue(vararg source: LiveData<T>): LiveData<T> =
                MediatorLiveData<T>().apply {
                    source.forEach { addSource(it) { postValue(it) } }
                }
    }
}