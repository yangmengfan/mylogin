package cn.myproject.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import cn.myproject.common.BaseEntity;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 文章内容
    * </p>
*
* @author yangmf
* @since 2019-06-13
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    public class BlogContent extends BaseEntity {

    private static final long serialVersionUID = 1L;

            /**
            * 标题
            */
    private String title;

            /**
            * 内容
            */
    private String content;

            /**
            * 标签
            */
    private String tag;

            /**
            * 分类
            */
    private String categories;

    private Integer hits;

            /**
            * 评论数量
            */
    private Integer commentsNum;

            /**
            * 开启评论
            */
    private Integer allowComment;

            /**
            * 状态
            */
    private Integer status;

            /**
            * 作者
            */
    private String author;

            /**
            * 创建时间
            */
    private LocalDateTime createTime;

            /**
            * 修改时间
            */
    private LocalDateTime modifyTime;


}
