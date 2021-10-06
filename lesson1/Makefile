fast_fibonacci.pdf: fast_fibonacci.ipynb
	jupyter nbconvert --to pdf fast_fibonacci.ipynb

jmh-results.txt:
	time ../gradlew jmh
	cp build/results/jmh/results.txt jmh-results.txt

jmh_results.pdf: jmh_results.ipynb
	jupyter nbconvert --to pdf jmh_results.ipynb
