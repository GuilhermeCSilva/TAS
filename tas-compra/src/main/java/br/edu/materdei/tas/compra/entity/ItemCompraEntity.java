package br.edu.materdei.tas.compra.entity;

import br.edu.materdei.tas.core.entity.ProdutoEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="itemcompra")
public class ItemCompraEntity {
    @Id
    @GeneratedValue
    private Integer id;
    
    @colunm(nullable = false)
    private Double qtdade;
    
    @column(nullable = false)
    private Double vlrunit;
    
    @ManyToOne
    @joinColumn(nullable = false)
    private ProdutoEntity produto;
    
}
