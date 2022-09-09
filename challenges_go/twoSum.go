package main

import "fmt"

func main() {
	fmt.Println(twoSum([]int{3, 3}, 6))
}

func twoSum(nums []int, target int) []int {
	result := make(map[int]int)

	for i, num := range nums {
		if index, ok := result[target-num]; ok {
			return []int{index, i}
		}
		result[num] = i
	}

	return nil
}
