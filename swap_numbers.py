# swap_numbers.py
def swap_numbers(a, b):
  """Swaps two numbers using a temporary variable."""
  temp = a
  a = b
  b = temp
  return a, b

if __name__ == "__main__":
  num1 = 10
  num2 = 20
  print(f"Before swapping: num1 = {num1}, num2 = {num2}")
  num1, num2 = swap_numbers(num1, num2)
  print(f"After swapping: num1 = {num1}, num2 = {num2}")
