from collections import deque
from datastructures_impl.employee import Employee


def getImportance(self, employees: list[Employee], id: int) -> int:

    employeeMap = {}

    for x in employees:

        employeeMap[x.id] = x

    empQ = deque()

    empQ.append(id)

    sumImp = 0

    while empQ:

        employee = employeeMap[empQ.popleft()]

        empQ.extend(employee.subordinates)

        sumImp += employee.importance

    return sumImp
