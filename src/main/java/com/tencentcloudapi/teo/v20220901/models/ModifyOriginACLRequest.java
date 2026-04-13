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

public class ModifyOriginACLRequest extends AbstractModel {

    /**
    * Specifies the site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Specifies the instance that needs to configurate origin ACLs.
    */
    @SerializedName("OriginACLEntities")
    @Expose
    private OriginACLEntity [] OriginACLEntities;

    /**
    * The origin protection back-to-origin ACL control domain remains unchanged by default if left blank. The domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

    /**
     * Get Specifies the site ID. 
     * @return ZoneId Specifies the site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the site ID.
     * @param ZoneId Specifies the site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Specifies the instance that needs to configurate origin ACLs. 
     * @return OriginACLEntities Specifies the instance that needs to configurate origin ACLs.
     */
    public OriginACLEntity [] getOriginACLEntities() {
        return this.OriginACLEntities;
    }

    /**
     * Set Specifies the instance that needs to configurate origin ACLs.
     * @param OriginACLEntities Specifies the instance that needs to configurate origin ACLs.
     */
    public void setOriginACLEntities(OriginACLEntity [] OriginACLEntities) {
        this.OriginACLEntities = OriginACLEntities;
    }

    /**
     * Get The origin protection back-to-origin ACL control domain remains unchanged by default if left blank. The domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li> 
     * @return OriginACLFamily The origin protection back-to-origin ACL control domain remains unchanged by default if left blank. The domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set The origin protection back-to-origin ACL control domain remains unchanged by default if left blank. The domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li>
     * @param OriginACLFamily The origin protection back-to-origin ACL control domain remains unchanged by default if left blank. The domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li>
     */
    public void setOriginACLFamily(String OriginACLFamily) {
        this.OriginACLFamily = OriginACLFamily;
    }

    public ModifyOriginACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginACLRequest(ModifyOriginACLRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.OriginACLEntities != null) {
            this.OriginACLEntities = new OriginACLEntity[source.OriginACLEntities.length];
            for (int i = 0; i < source.OriginACLEntities.length; i++) {
                this.OriginACLEntities[i] = new OriginACLEntity(source.OriginACLEntities[i]);
            }
        }
        if (source.OriginACLFamily != null) {
            this.OriginACLFamily = new String(source.OriginACLFamily);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "OriginACLEntities.", this.OriginACLEntities);
        this.setParamSimple(map, prefix + "OriginACLFamily", this.OriginACLFamily);

    }
}

