section .data
    a dd 10
    b dd 20
    sum dd 0

section .text
    global _start

_start:
    mov eax, [a]    ; Load value of 'a' into register eax
    add eax, [b]    ; Add value of 'b' to register eax
    mov [sum], eax  ; Store result in 'sum'

    ; Exit (using a Linux system call)
    mov eax, 1      ; sys_exit
    xor ebx, ebx    ; return 0
    int 0x80        ; interrupt to invoke system call
