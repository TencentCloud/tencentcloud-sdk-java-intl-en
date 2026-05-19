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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Pulled material type. Valid values:
<li>UserDefine: User-customized material library;</li>
<li>Default: Default sample library.</li>

Default value: UserDefine, pull user-customized material library materials.
Description: If you pull the system default material library, you can only use the material name or material ID + material name via pull, and the facial features image returns only one.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Material ID, with an array length limit of 100.
    */
    @SerializedName("PersonIds")
    @Expose
    private String [] PersonIds;

    /**
    * Material name. Array length limit: 20.
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * Material tag. Array length limit: 20.
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
    * Number of returned entries. Default value: 100. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Pulled material type. Valid values:
<li>UserDefine: User-customized material library;</li>
<li>Default: Default sample library.</li>

Default value: UserDefine, pull user-customized material library materials.
Description: If you pull the system default material library, you can only use the material name or material ID + material name via pull, and the facial features image returns only one. 
     * @return Type Pulled material type. Valid values:
<li>UserDefine: User-customized material library;</li>
<li>Default: Default sample library.</li>

Default value: UserDefine, pull user-customized material library materials.
Description: If you pull the system default material library, you can only use the material name or material ID + material name via pull, and the facial features image returns only one.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Pulled material type. Valid values:
<li>UserDefine: User-customized material library;</li>
<li>Default: Default sample library.</li>

Default value: UserDefine, pull user-customized material library materials.
Description: If you pull the system default material library, you can only use the material name or material ID + material name via pull, and the facial features image returns only one.
     * @param Type Pulled material type. Valid values:
<li>UserDefine: User-customized material library;</li>
<li>Default: Default sample library.</li>

Default value: UserDefine, pull user-customized material library materials.
Description: If you pull the system default material library, you can only use the material name or material ID + material name via pull, and the facial features image returns only one.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Material ID, with an array length limit of 100. 
     * @return PersonIds Material ID, with an array length limit of 100.
     */
    public String [] getPersonIds() {
        return this.PersonIds;
    }

    /**
     * Set Material ID, with an array length limit of 100.
     * @param PersonIds Material ID, with an array length limit of 100.
     */
    public void setPersonIds(String [] PersonIds) {
        this.PersonIds = PersonIds;
    }

    /**
     * Get Material name. Array length limit: 20. 
     * @return Names Material name. Array length limit: 20.
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set Material name. Array length limit: 20.
     * @param Names Material name. Array length limit: 20.
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get Material tag. Array length limit: 20. 
     * @return Tags Material tag. Array length limit: 20.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Material tag. Array length limit: 20.
     * @param Tags Material tag. Array length limit: 20.
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
     * Get Number of returned entries. Default value: 100. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 100. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 100. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 100. Maximum value: 100.
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

