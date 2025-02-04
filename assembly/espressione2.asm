; multi-segment executable file template.    
;programma che calcola K=4(3m--j)+3h-2p       dove p=12, m=50, j=19, h=6

data segment
    
    p DW 12
    m DW 50
    j DW 19
    h DW 6
    k DW ?
    pkey db "hgoerghewgrehreh"
    
    
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
    
     mov ax,m
     add ax,m
     add ax,m
     sub ax,j
     mov bx,ax
     add ax,bx
     add ax,bx
     add ax,bx
     mov bx,h
     add bx,h
     add bx,h
     add ax,bx
     mov bx,p
     add bx,p
     sub ax,bx
     
     mov k,ax                                     

    
    
    
    
    
    
        ; output string at ds:dx
    
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


