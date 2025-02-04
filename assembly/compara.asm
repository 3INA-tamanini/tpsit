; multi-segment executable file template.

data segment
    ; add your data here!
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
    
    
    mov al, 02h
    mov ah,02h
    cmp al,ah
    
    jne not_equal
    jmp equal:
    
    not_equal:
    mov ah, 02h
    mov dx, offset 'n'
    int 21h
    jmp end1
    
    equal:
    mov ah,02h
    mov dx, offset 'y'
    int 21h
    jmp end1 
    
end1:
    mov ah, 4ch
    int 21h
    code ends   
ends

end start ; set entry point and stop the assembler.
