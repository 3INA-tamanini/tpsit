; multi-segment executable file template.

data segment
    ; add your data here!
    numero      dw 7h 
    dividitore  db 02h
    messpari    db "pari$"
    messdispari db "dispari$"
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, @data
    mov ds, ax
    mov es, ax

    ; add your code here
            
    mov ax,numero 
    div dividitore 
    
    cmp ah, 0 
    
    je pari
    jmp dispari
    
         
         
    pari:
    lea dx, messpari
    mov ah,9
    int 21h 
    jmp fine
    
         
    dispari:
    lea dx, messdispari
    mov ah,9
    int 21h

    
    
    
    
           ; output string at ds:dx
    
    ; wait for any key....  
    
      
    mov ah, 1
    int 21h
    
    
    fine:
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.
