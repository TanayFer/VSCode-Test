cmake_minimum_required(VERSION 3.31.0)
project`(NewTestProject VERSION 1.0.0 LANGUAGES C C++ Shell)

include(CTest)
enable_testing()

add_executable(NewTestProject myFirst.cpp)

