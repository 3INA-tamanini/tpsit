;un programma che calcola W=3(X+2Y)-3Z
data segment
    x DW 50
    y DW 15
    z DW 20
    w DW ?
    
    
    pkey db "press any key...$"
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax                                                                                                                                                                                                                                                 

    mov ax, x
    mov bx, y
    
    add bx, y
    add ax, bx
    
    mov bx, ax
    add ax, bx                     
    add ax, bx
    sub ax, z
    sub ax, z
    sub ax, z
    
    mov w, ax             
                  
    lea dx, pkey
    mov ah, 9
    int 21h        ; output string at ds:dx
    
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.
