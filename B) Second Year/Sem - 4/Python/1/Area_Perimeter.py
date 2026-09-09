import math

def circle(radius):
    area = math.pi * radius ** 2;
    perimeter = 2 * math.pi * radius;
    return area, perimeter;

def rectangle(length, width):
    area = length * width;
    perimeter = 2 * (length + width);
    return area, perimeter;

def triangle(base, height, side1, side2):
    area = 0.5 * base * height;
    perimeter = base + side1 + side2;
    return area, perimeter;

# Example usage
if __name__ == "__main__":
    print("Circle: ", circle(5));
    print("Rectangle: ", rectangle(4, 6));
    print("Triangle: ", triangle(3, 4, 5, 5));