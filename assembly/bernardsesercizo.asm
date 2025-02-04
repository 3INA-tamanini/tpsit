; multi-segment executable file template.

data segment
    ; add your data here!
    messmagg db "maggiore$"
    messmin db "minore$"
    messmaggdispari db "dispari$"
    messmindispari db "dispari$"
    messmaggpari db "pari$"
    messminpari db "pari$"
    
    
    d db 02h
    nuno db 34h
    ndue db 33h
    
    
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
            
    mov al, nuno
    mov ah, ndue
    cmp al,ah
    ja maggiore
    
    
    minore:
    lea dx, messmin
    mov ah, 9
    int 21h   


    
    cmp ah, 0 
    
    je minpari
    jmp mindispari
    
    
    
    
    maggiore:
    lea dx, messmagg
    mov ah,9
    int 21h 
     
    
    cmp ah, 0 
    
    je magpari
    jmp magdispari
       
    magpari:
    lea dx, messmaggpari
    mov ah,9
    int 21h 
    jmp fine
    
         
    magdispari:
    lea dx, messmaggdispari
    mov ah,9
    int 21h
    jmp fine
    
    minpari:
    lea dx, messminpari
    mov ah,9
    int 21h 
    jmp fine
    
         
    mindispari:
    lea dx, messmindispari
    mov ah,9
    int 21h
       
              ;output string at ds:dx
              
   ;wait for any key
   mov ah, 1
   int 21h
   
   fine:
   mov ax, 4c00h ;exit the operating system
   int 21h           
ends

end start ; set entry point and stop the assembler.

