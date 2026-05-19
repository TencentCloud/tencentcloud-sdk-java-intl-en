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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProcedureTemplatesRequest extends AbstractModel {

    /**
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Task flow template name filter conditions. The array can contain up to 100 conditions.</p>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <p>Filtering condition for the task flow template type. Valid values:</p><li>Preset: system preset task flow template;</li><li>Custom: user-defined task flow template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Paging offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Specify the field to sort the returned results in ascending or descending order. Sort.Field currently only supports CreateTime. Sort.Order can be desc (descending order) or asc (ascending order).</p><p>Input parameter limitation: Currently only the CreateTime field is supported for sorting.</p>
    */
    @SerializedName("SortBy")
    @Expose
    private SortBy [] SortBy;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Task flow template name filter conditions. The array can contain up to 100 conditions.</p> 
     * @return Names <p>Task flow template name filter conditions. The array can contain up to 100 conditions.</p>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set <p>Task flow template name filter conditions. The array can contain up to 100 conditions.</p>
     * @param Names <p>Task flow template name filter conditions. The array can contain up to 100 conditions.</p>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <p>Filtering condition for the task flow template type. Valid values:</p><li>Preset: system preset task flow template;</li><li>Custom: user-defined task flow template.</li> 
     * @return Type <p>Filtering condition for the task flow template type. Valid values:</p><li>Preset: system preset task flow template;</li><li>Custom: user-defined task flow template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Filtering condition for the task flow template type. Valid values:</p><li>Preset: system preset task flow template;</li><li>Custom: user-defined task flow template.</li>
     * @param Type <p>Filtering condition for the task flow template type. Valid values:</p><li>Preset: system preset task flow template;</li><li>Custom: user-defined task flow template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Paging offset. Default value: 0.</p> 
     * @return Offset <p>Paging offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset. Default value: 0.</p>
     * @param Offset <p>Paging offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned entries. Default value: 10. Maximum value: 100.</p> 
     * @return Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     * @param Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Specify the field to sort the returned results in ascending or descending order. Sort.Field currently only supports CreateTime. Sort.Order can be desc (descending order) or asc (ascending order).</p><p>Input parameter limitation: Currently only the CreateTime field is supported for sorting.</p> 
     * @return SortBy <p>Specify the field to sort the returned results in ascending or descending order. Sort.Field currently only supports CreateTime. Sort.Order can be desc (descending order) or asc (ascending order).</p><p>Input parameter limitation: Currently only the CreateTime field is supported for sorting.</p>
     */
    public SortBy [] getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>Specify the field to sort the returned results in ascending or descending order. Sort.Field currently only supports CreateTime. Sort.Order can be desc (descending order) or asc (ascending order).</p><p>Input parameter limitation: Currently only the CreateTime field is supported for sorting.</p>
     * @param SortBy <p>Specify the field to sort the returned results in ascending or descending order. Sort.Field currently only supports CreateTime. Sort.Order can be desc (descending order) or asc (ascending order).</p><p>Input parameter limitation: Currently only the CreateTime field is supported for sorting.</p>
     */
    public void setSortBy(SortBy [] SortBy) {
        this.SortBy = SortBy;
    }

    public DescribeProcedureTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProcedureTemplatesRequest(DescribeProcedureTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new SortBy[source.SortBy.length];
            for (int i = 0; i < source.SortBy.length; i++) {
                this.SortBy[i] = new SortBy(source.SortBy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "SortBy.", this.SortBy);

    }
}

