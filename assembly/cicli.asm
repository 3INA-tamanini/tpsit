; multi-segment executable file template.

data segment
    ; add your data here!  
    
    n1  db 34h
    n2  db 35h
    ris dw ?
    
    pkey db "press any key...$"
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:                    o
                            
    mov ax, @data
    mov ds, ax
    mov es, ax

    ; add your code here
             
    mov ax,0000h       
    mov ch,0
    mov cl, n1
    mov bh, 0
    mov bl, n2
    
    ciclo:
    add ax,bx
    dec cx
    
    cmp cx,0
    jnz ciclo    
    mov ris, ax
            
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