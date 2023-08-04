/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateZoneRequest extends AbstractModel{

    /**
    * The site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * The access mode. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME. Before using this access mode, first verify your site with the site verification API (IdentifyZone).<li>`noDomainAccess`: Access without using a domain name. If this value is passed, only the Tags field needs to be set. </li>
If not specified, this field uses the default value `full`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether to skip scanning the existing DNS records of the site. Default value: false.
    */
    @SerializedName("JumpStart")
    @Expose
    private Boolean JumpStart;

    /**
    * The resource tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used.
    */
    @SerializedName("AllowDuplicates")
    @Expose
    private Boolean AllowDuplicates;

    /**
    * The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_).
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
     * Get The site name. 
     * @return ZoneName The site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set The site name.
     * @param ZoneName The site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get The access mode. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME. Before using this access mode, first verify your site with the site verification API (IdentifyZone).<li>`noDomainAccess`: Access without using a domain name. If this value is passed, only the Tags field needs to be set. </li>
If not specified, this field uses the default value `full`. 
     * @return Type The access mode. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME. Before using this access mode, first verify your site with the site verification API (IdentifyZone).<li>`noDomainAccess`: Access without using a domain name. If this value is passed, only the Tags field needs to be set. </li>
If not specified, this field uses the default value `full`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The access mode. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME. Before using this access mode, first verify your site with the site verification API (IdentifyZone).<li>`noDomainAccess`: Access without using a domain name. If this value is passed, only the Tags field needs to be set. </li>
If not specified, this field uses the default value `full`.
     * @param Type The access mode. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME. Before using this access mode, first verify your site with the site verification API (IdentifyZone).<li>`noDomainAccess`: Access without using a domain name. If this value is passed, only the Tags field needs to be set. </li>
If not specified, this field uses the default value `full`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to skip scanning the existing DNS records of the site. Default value: false. 
     * @return JumpStart Whether to skip scanning the existing DNS records of the site. Default value: false.
     */
    public Boolean getJumpStart() {
        return this.JumpStart;
    }

    /**
     * Set Whether to skip scanning the existing DNS records of the site. Default value: false.
     * @param JumpStart Whether to skip scanning the existing DNS records of the site. Default value: false.
     */
    public void setJumpStart(Boolean JumpStart) {
        this.JumpStart = JumpStart;
    }

    /**
     * Get The resource tag. 
     * @return Tags The resource tag.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The resource tag.
     * @param Tags The resource tag.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used. 
     * @return AllowDuplicates Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used.
     */
    public Boolean getAllowDuplicates() {
        return this.AllowDuplicates;
    }

    /**
     * Set Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used.
     * @param AllowDuplicates Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used.
     */
    public void setAllowDuplicates(Boolean AllowDuplicates) {
        this.AllowDuplicates = AllowDuplicates;
    }

    /**
     * Get The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_). 
     * @return AliasZoneName The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_).
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_).
     * @param AliasZoneName The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_).
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    public CreateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateZoneRequest(CreateZoneRequest source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.JumpStart != null) {
            this.JumpStart = new Boolean(source.JumpStart);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AllowDuplicates != null) {
            this.AllowDuplicates = new Boolean(source.AllowDuplicates);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "JumpStart", this.JumpStart);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AllowDuplicates", this.AllowDuplicates);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);

    }
}

