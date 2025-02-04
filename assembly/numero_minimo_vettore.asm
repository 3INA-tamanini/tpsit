; multi-segment executable file template.

DIM EQU 10

data segment
    ; add your data here!
    
    vett dw 7,3,1,11,4,7,20,3,5,10
    min dw ?
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

    ; add your code here
    
    mov cx, 0  
    
    mov ax,0        
    
    mov ax, vett[si]
    mov cx, DIM
    mov si,0
    
    
ciclo:
    
    cmp ax,vett[si]
    jb scan
    mov ax,vett[si]
    
scan:
    add si,2        
    
    loop ciclo  
    
    mov min,ax
            
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
