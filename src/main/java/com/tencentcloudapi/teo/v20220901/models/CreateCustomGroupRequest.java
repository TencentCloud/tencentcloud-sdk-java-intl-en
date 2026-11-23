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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomGroupRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Custom group name.</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>Custom group type. It cannot be modified after creation. Different types of custom groups support different entry types.</p><p>Valid values:</p><ul><li>TLSFingerprint: TLS fingerprint group, supporting JA3 and JA4 entries</li><li>UA: UA group, supporting UA entries</li><li>Referer: Referer group, supporting Referer entries</li></ul>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>List of custom group entries.</p>
    */
    @SerializedName("GroupItems")
    @Expose
    private CustomGroupItem [] GroupItems;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Custom group name.</p> 
     * @return GroupName <p>Custom group name.</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>Custom group name.</p>
     * @param GroupName <p>Custom group name.</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>Custom group type. It cannot be modified after creation. Different types of custom groups support different entry types.</p><p>Valid values:</p><ul><li>TLSFingerprint: TLS fingerprint group, supporting JA3 and JA4 entries</li><li>UA: UA group, supporting UA entries</li><li>Referer: Referer group, supporting Referer entries</li></ul> 
     * @return GroupType <p>Custom group type. It cannot be modified after creation. Different types of custom groups support different entry types.</p><p>Valid values:</p><ul><li>TLSFingerprint: TLS fingerprint group, supporting JA3 and JA4 entries</li><li>UA: UA group, supporting UA entries</li><li>Referer: Referer group, supporting Referer entries</li></ul>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>Custom group type. It cannot be modified after creation. Different types of custom groups support different entry types.</p><p>Valid values:</p><ul><li>TLSFingerprint: TLS fingerprint group, supporting JA3 and JA4 entries</li><li>UA: UA group, supporting UA entries</li><li>Referer: Referer group, supporting Referer entries</li></ul>
     * @param GroupType <p>Custom group type. It cannot be modified after creation. Different types of custom groups support different entry types.</p><p>Valid values:</p><ul><li>TLSFingerprint: TLS fingerprint group, supporting JA3 and JA4 entries</li><li>UA: UA group, supporting UA entries</li><li>Referer: Referer group, supporting Referer entries</li></ul>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>List of custom group entries.</p> 
     * @return GroupItems <p>List of custom group entries.</p>
     */
    public CustomGroupItem [] getGroupItems() {
        return this.GroupItems;
    }

    /**
     * Set <p>List of custom group entries.</p>
     * @param GroupItems <p>List of custom group entries.</p>
     */
    public void setGroupItems(CustomGroupItem [] GroupItems) {
        this.GroupItems = GroupItems;
    }

    public CreateCustomGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomGroupRequest(CreateCustomGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupItems != null) {
            this.GroupItems = new CustomGroupItem[source.GroupItems.length];
            for (int i = 0; i < source.GroupItems.length; i++) {
                this.GroupItems[i] = new CustomGroupItem(source.GroupItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArrayObj(map, prefix + "GroupItems.", this.GroupItems);

    }
}

