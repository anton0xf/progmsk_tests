Implement fast algorithms to calculate (big) integer power
and to get nth Fibonacci number.

It is a standard gradle project.

To test run `../gradlew test`

Other files:
* [fast_fibonacci.ipynb](fast_fibonacci.ipynb) - some explanation of used equations. \
  [fast_fibonacci.pdf](fast_fibonacci.pdf) - pdf render of notebook
* [jmh_results.ipynb](jmh_results.ipynb) - JMH benchmark visualization. \
  [jmh_results.pdf](jmh_results.pdf) - pdf render of notebook

To use these jupyter notebooks install:
```shell
pip install --user jupyter sympy scipy numpy pandas matplotlib seaborn
```
Tested on Python 3.8.

To repeat JMH benchmark use `make jmh-results.txt` or just `../gradlew jmh`.

To regenerate pdf's use `make file_name.pdf`.
For this You need [nbconvert](https://nbconvert.readthedocs.io/en/latest/install.html).
