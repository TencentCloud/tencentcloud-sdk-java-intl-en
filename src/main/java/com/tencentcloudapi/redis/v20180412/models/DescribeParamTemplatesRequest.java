/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamTemplatesRequest extends AbstractModel {

    /**
    * <p>Specified query for product version and architecture.</p><ul><li>6: Redis 4.0 standard architecture;</li><li>7: Redis 4.0 cluster architecture;</li><li>8: Redis 5.0 standard architecture;</li><li>9: Redis 5.0 cluster architecture;</li><li>15: Redis 6.2 standard architecture;</li><li>16: Redis 6.2 cluster architecture;</li><li>17: Redis 7.0 standard architecture;</li><li>18: Redis 7.0 cluster architecture;</li><li>19: ValKey 8.0 standard architecture;</li><li>20: ValKey 8.0 cluster architecture.</li></ul>
    */
    @SerializedName("ProductTypes")
    @Expose
    private Long [] ProductTypes;

    /**
    * <p>Specify the parameter template name for the query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the Template name of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul>
    */
    @SerializedName("TemplateNames")
    @Expose
    private String [] TemplateNames;

    /**
    * <p>Parameter template ID specified for query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the template ID of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul>
    */
    @SerializedName("TemplateIds")
    @Expose
    private String [] TemplateIds;

    /**
    * <p>Specify the pagination size of the query result, which is the number of records returned per page.</p><ul><li>Value ranges from 0–200.</li><li>Default value: 200.</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Pagination offset, used to specify the starting position of the query result.</p><ul><li>Value: Must be an integral multiple of Limit. Default value is 0.</li><li>Calculation formula: offset=limit*(page number-1).</li></ul>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>Specified query for product version and architecture.</p><ul><li>6: Redis 4.0 standard architecture;</li><li>7: Redis 4.0 cluster architecture;</li><li>8: Redis 5.0 standard architecture;</li><li>9: Redis 5.0 cluster architecture;</li><li>15: Redis 6.2 standard architecture;</li><li>16: Redis 6.2 cluster architecture;</li><li>17: Redis 7.0 standard architecture;</li><li>18: Redis 7.0 cluster architecture;</li><li>19: ValKey 8.0 standard architecture;</li><li>20: ValKey 8.0 cluster architecture.</li></ul> 
     * @return ProductTypes <p>Specified query for product version and architecture.</p><ul><li>6: Redis 4.0 standard architecture;</li><li>7: Redis 4.0 cluster architecture;</li><li>8: Redis 5.0 standard architecture;</li><li>9: Redis 5.0 cluster architecture;</li><li>15: Redis 6.2 standard architecture;</li><li>16: Redis 6.2 cluster architecture;</li><li>17: Redis 7.0 standard architecture;</li><li>18: Redis 7.0 cluster architecture;</li><li>19: ValKey 8.0 standard architecture;</li><li>20: ValKey 8.0 cluster architecture.</li></ul>
     */
    public Long [] getProductTypes() {
        return this.ProductTypes;
    }

    /**
     * Set <p>Specified query for product version and architecture.</p><ul><li>6: Redis 4.0 standard architecture;</li><li>7: Redis 4.0 cluster architecture;</li><li>8: Redis 5.0 standard architecture;</li><li>9: Redis 5.0 cluster architecture;</li><li>15: Redis 6.2 standard architecture;</li><li>16: Redis 6.2 cluster architecture;</li><li>17: Redis 7.0 standard architecture;</li><li>18: Redis 7.0 cluster architecture;</li><li>19: ValKey 8.0 standard architecture;</li><li>20: ValKey 8.0 cluster architecture.</li></ul>
     * @param ProductTypes <p>Specified query for product version and architecture.</p><ul><li>6: Redis 4.0 standard architecture;</li><li>7: Redis 4.0 cluster architecture;</li><li>8: Redis 5.0 standard architecture;</li><li>9: Redis 5.0 cluster architecture;</li><li>15: Redis 6.2 standard architecture;</li><li>16: Redis 6.2 cluster architecture;</li><li>17: Redis 7.0 standard architecture;</li><li>18: Redis 7.0 cluster architecture;</li><li>19: ValKey 8.0 standard architecture;</li><li>20: ValKey 8.0 cluster architecture.</li></ul>
     */
    public void setProductTypes(Long [] ProductTypes) {
        this.ProductTypes = ProductTypes;
    }

    /**
     * Get <p>Specify the parameter template name for the query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the Template name of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul> 
     * @return TemplateNames <p>Specify the parameter template name for the query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the Template name of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul>
     */
    public String [] getTemplateNames() {
        return this.TemplateNames;
    }

    /**
     * Set <p>Specify the parameter template name for the query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the Template name of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul>
     * @param TemplateNames <p>Specify the parameter template name for the query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the Template name of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul>
     */
    public void setTemplateNames(String [] TemplateNames) {
        this.TemplateNames = TemplateNames;
    }

    /**
     * Get <p>Parameter template ID specified for query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the template ID of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul> 
     * @return TemplateIds <p>Parameter template ID specified for query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the template ID of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul>
     */
    public String [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set <p>Parameter template ID specified for query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the template ID of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul>
     * @param TemplateIds <p>Parameter template ID specified for query.</p><ul><li>Data type: string array, with a maximum length limit of 50.</li><li>Method for obtaining: Copy the template ID of a custom template or system default template on the <a href="https://console.cloud.tencent.com/redis/templates">parameter template page in the Redis console</a>.</li></ul>
     */
    public void setTemplateIds(String [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get <p>Specify the pagination size of the query result, which is the number of records returned per page.</p><ul><li>Value ranges from 0–200.</li><li>Default value: 200.</li></ul> 
     * @return Limit <p>Specify the pagination size of the query result, which is the number of records returned per page.</p><ul><li>Value ranges from 0–200.</li><li>Default value: 200.</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Specify the pagination size of the query result, which is the number of records returned per page.</p><ul><li>Value ranges from 0–200.</li><li>Default value: 200.</li></ul>
     * @param Limit <p>Specify the pagination size of the query result, which is the number of records returned per page.</p><ul><li>Value ranges from 0–200.</li><li>Default value: 200.</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Pagination offset, used to specify the starting position of the query result.</p><ul><li>Value: Must be an integral multiple of Limit. Default value is 0.</li><li>Calculation formula: offset=limit*(page number-1).</li></ul> 
     * @return Offset <p>Pagination offset, used to specify the starting position of the query result.</p><ul><li>Value: Must be an integral multiple of Limit. Default value is 0.</li><li>Calculation formula: offset=limit*(page number-1).</li></ul>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset, used to specify the starting position of the query result.</p><ul><li>Value: Must be an integral multiple of Limit. Default value is 0.</li><li>Calculation formula: offset=limit*(page number-1).</li></ul>
     * @param Offset <p>Pagination offset, used to specify the starting position of the query result.</p><ul><li>Value: Must be an integral multiple of Limit. Default value is 0.</li><li>Calculation formula: offset=limit*(page number-1).</li></ul>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeParamTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamTemplatesRequest(DescribeParamTemplatesRequest source) {
        if (source.ProductTypes != null) {
            this.ProductTypes = new Long[source.ProductTypes.length];
            for (int i = 0; i < source.ProductTypes.length; i++) {
                this.ProductTypes[i] = new Long(source.ProductTypes[i]);
            }
        }
        if (source.TemplateNames != null) {
            this.TemplateNames = new String[source.TemplateNames.length];
            for (int i = 0; i < source.TemplateNames.length; i++) {
                this.TemplateNames[i] = new String(source.TemplateNames[i]);
            }
        }
        if (source.TemplateIds != null) {
            this.TemplateIds = new String[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new String(source.TemplateIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProductTypes.", this.ProductTypes);
        this.setParamArraySimple(map, prefix + "TemplateNames.", this.TemplateNames);
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

