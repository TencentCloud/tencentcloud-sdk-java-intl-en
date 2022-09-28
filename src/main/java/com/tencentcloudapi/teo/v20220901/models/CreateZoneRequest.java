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
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>This field will be set to the default value `full` if not specified.
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
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>This field will be set to the default value `full` if not specified. 
     * @return Type The access mode. Values:
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>This field will be set to the default value `full` if not specified.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The access mode. Values:
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>This field will be set to the default value `full` if not specified.
     * @param Type The access mode. Values:
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>This field will be set to the default value `full` if not specified.
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "JumpStart", this.JumpStart);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

