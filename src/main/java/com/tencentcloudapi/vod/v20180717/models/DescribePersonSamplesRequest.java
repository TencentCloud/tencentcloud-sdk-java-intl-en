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
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Type of samples to pull. Valid values:
<li>UserDefine: custom sample library</li>
<li>Default: default sample library</li>

Default value: UserDefine. Samples in the custom sample library will be pulled.
Note: samples from the default library can only be pulled by providing the name or both the ID and name of a sample. Only one face image will be returned.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * IDs of samples. Array length limit: 100.
    */
    @SerializedName("PersonIds")
    @Expose
    private String [] PersonIds;

    /**
    * Names of samples. Array length limit: 20.
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * Tags of a sample. Array length limit: 20.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries to be returned. Default value: 100. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Type of samples to pull. Valid values:
<li>UserDefine: custom sample library</li>
<li>Default: default sample library</li>

Default value: UserDefine. Samples in the custom sample library will be pulled.
Note: samples from the default library can only be pulled by providing the name or both the ID and name of a sample. Only one face image will be returned. 
     * @return Type Type of samples to pull. Valid values:
<li>UserDefine: custom sample library</li>
<li>Default: default sample library</li>

Default value: UserDefine. Samples in the custom sample library will be pulled.
Note: samples from the default library can only be pulled by providing the name or both the ID and name of a sample. Only one face image will be returned.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of samples to pull. Valid values:
<li>UserDefine: custom sample library</li>
<li>Default: default sample library</li>

Default value: UserDefine. Samples in the custom sample library will be pulled.
Note: samples from the default library can only be pulled by providing the name or both the ID and name of a sample. Only one face image will be returned.
     * @param Type Type of samples to pull. Valid values:
<li>UserDefine: custom sample library</li>
<li>Default: default sample library</li>

Default value: UserDefine. Samples in the custom sample library will be pulled.
Note: samples from the default library can only be pulled by providing the name or both the ID and name of a sample. Only one face image will be returned.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get IDs of samples. Array length limit: 100. 
     * @return PersonIds IDs of samples. Array length limit: 100.
     */
    public String [] getPersonIds() {
        return this.PersonIds;
    }

    /**
     * Set IDs of samples. Array length limit: 100.
     * @param PersonIds IDs of samples. Array length limit: 100.
     */
    public void setPersonIds(String [] PersonIds) {
        this.PersonIds = PersonIds;
    }

    /**
     * Get Names of samples. Array length limit: 20. 
     * @return Names Names of samples. Array length limit: 20.
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set Names of samples. Array length limit: 20.
     * @param Names Names of samples. Array length limit: 20.
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get Tags of a sample. Array length limit: 20. 
     * @return Tags Tags of a sample. Array length limit: 20.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags of a sample. Array length limit: 20.
     * @param Tags Tags of a sample. Array length limit: 20.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Pagination offset. Default value: 0. 
     * @return Offset Pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0.
     * @param Offset Pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries to be returned. Default value: 100. Maximum value: 100. 
     * @return Limit Number of entries to be returned. Default value: 100. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned. Default value: 100. Maximum value: 100.
     * @param Limit Number of entries to be returned. Default value: 100. Maximum value: 100.
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

