section .data
    a dd 10.5      ; Define a 32-bit float variable 'a' with value 10.5
    b dd 20.75     ; Define a 32-bit float variable 'b' with value 20.75
    sum dd 0.0     ; Define a 32-bit float variable 'sum' initialized to 0.0

section .text
    global _start

_start:
    fld dword [a]    ; Load the value of 'a' into the floating-point stack
    fadd dword [b]  ; Add the value of 'b' to the value on the floating-point stack
    fstp dword [sum]  ; Store the result from the floating-point stack into 'sum'

    ; Exit (using a Linux system call)
    mov eax, 1      ; sys_exit
    xor ebx, ebx    ; return 0
    int 0x80        ; interrupt to invoke system call
