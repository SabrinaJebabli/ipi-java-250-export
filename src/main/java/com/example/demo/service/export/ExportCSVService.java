package com.example.demo.service.export;

import com.example.demo.dto.ClientDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

@Service
public class ExportCSVService {
    public void export(Writer printWriter, List<ClientDTO> clients)throws IOException{
        printWriter.write("Nom");
        printWriter.write(";");
        printWriter.write("Prenom");
        printWriter.write("\n");
        for(int i = 0; i < clients.size(); i++){
            printWriter.write(clients.get(i).getNom().replaceAll(";",""));
            printWriter.write(";");
            printWriter.write(clients.get(i).getPrenom().replaceAll(";",""));
            printWriter.write("\n");
        }



    }
}
