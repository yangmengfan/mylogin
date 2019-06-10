package cn.myplay.entity;

    import cn.myplay.common.BaseEntity;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author yangmf
* @since 2019-06-10
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String role;


}
