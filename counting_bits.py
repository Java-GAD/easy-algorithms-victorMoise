from typing import List

class Solution:
    def countBits(self, n: int) -> List[int]:
        total_bits = []
        
        for number in range(n + 1):
            binary_form = bin(number)
            total_bits.append(str(binary_form).count("1"))
            
        return total_bits

solution = Solution()
n = 5
result = solution.countBits(n)
print(result)