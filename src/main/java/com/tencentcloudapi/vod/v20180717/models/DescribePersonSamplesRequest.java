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

public class DescribePersonSamplesRequest extends AbstractModel {

    /**
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in as the application ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Pulled material type. Available values:</p><li>UserDefine: user-customized material library;</li><li>Default: default sample library.</li><p>Default value: UserDefine, which pulls materials from the user-customized material library.<br>Description: If pulling from the default sample library, you can only pull by material name or material ID + material name, and only one facial features image is returned.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Material ID. Array length limit: 100.</p>
    */
    @SerializedName("PersonIds")
    @Expose
    private String [] PersonIds;

    /**
    * <p>Material name. Array length limit: 20.</p>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <p>Material tag. Array length limit: 20.</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Paging offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned entries. Default value: 100. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in as the application ID.</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in as the application ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in as the application ID.</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in as the application ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Pulled material type. Available values:</p><li>UserDefine: user-customized material library;</li><li>Default: default sample library.</li><p>Default value: UserDefine, which pulls materials from the user-customized material library.<br>Description: If pulling from the default sample library, you can only pull by material name or material ID + material name, and only one facial features image is returned.</p> 
     * @return Type <p>Pulled material type. Available values:</p><li>UserDefine: user-customized material library;</li><li>Default: default sample library.</li><p>Default value: UserDefine, which pulls materials from the user-customized material library.<br>Description: If pulling from the default sample library, you can only pull by material name or material ID + material name, and only one facial features image is returned.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Pulled material type. Available values:</p><li>UserDefine: user-customized material library;</li><li>Default: default sample library.</li><p>Default value: UserDefine, which pulls materials from the user-customized material library.<br>Description: If pulling from the default sample library, you can only pull by material name or material ID + material name, and only one facial features image is returned.</p>
     * @param Type <p>Pulled material type. Available values:</p><li>UserDefine: user-customized material library;</li><li>Default: default sample library.</li><p>Default value: UserDefine, which pulls materials from the user-customized material library.<br>Description: If pulling from the default sample library, you can only pull by material name or material ID + material name, and only one facial features image is returned.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Material ID. Array length limit: 100.</p> 
     * @return PersonIds <p>Material ID. Array length limit: 100.</p>
     */
    public String [] getPersonIds() {
        return this.PersonIds;
    }

    /**
     * Set <p>Material ID. Array length limit: 100.</p>
     * @param PersonIds <p>Material ID. Array length limit: 100.</p>
     */
    public void setPersonIds(String [] PersonIds) {
        this.PersonIds = PersonIds;
    }

    /**
     * Get <p>Material name. Array length limit: 20.</p> 
     * @return Names <p>Material name. Array length limit: 20.</p>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set <p>Material name. Array length limit: 20.</p>
     * @param Names <p>Material name. Array length limit: 20.</p>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <p>Material tag. Array length limit: 20.</p> 
     * @return Tags <p>Material tag. Array length limit: 20.</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Material tag. Array length limit: 20.</p>
     * @param Tags <p>Material tag. Array length limit: 20.</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
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
     * Get <p>Number of returned entries. Default value: 100. Maximum value: 100.</p> 
     * @return Limit <p>Number of returned entries. Default value: 100. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned entries. Default value: 100. Maximum value: 100.</p>
     * @param Limit <p>Number of returned entries. Default value: 100. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePersonSamplesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePersonSamplesRequest(DescribePersonSamplesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PersonIds != null) {
            this.PersonIds = new String[source.PersonIds.length];
            for (int i = 0; i < source.PersonIds.length; i++) {
                this.PersonIds[i] = new String(source.PersonIds[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "PersonIds.", this.PersonIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

