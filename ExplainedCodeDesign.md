# Design Approaches





### Approach

This is a  basic IPO (Input-Process-Output) approach where each number
represents an element in the stream pipeline that is composed of the various
input, processing and output stages. This approach suggested itself,
as each element can go through the pipeline individually. It  also facilitate
a functional programming style

### Design

The input part is responsible for reading from various sources and sanitising the input.
The process part does all transformations, e.g. splitting of numbers and lookup of words.

While the input is a stream of elements travelling individually through the pipeline,
the dictionary is a static single set. 
Technology Used is

- The streaming API Java 8
- OOP based class layout
- Recursion (for PhoneNumberSplitter)

### Design Decisions


- Use java.util.Logger instead of slf4j + log4j 2 because no frameworks were allowed
- All output via logger instead of finer-grained solution
    - Debug log -> FINE
    - User info -> INFO
    - Errors -> WARNING
- ToDo tests for platform wrapper logic (STD IN / FileIO)
   streams Used in many places, even where input is not available asynchronously
  (as e.g. with java.nio for FileIO).

- ToDo integration tests (due to time).

