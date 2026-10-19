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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBucketAccessWay extends AbstractModel {

    /**
    * Access methods:
specify users
anonymous access allowed
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Number of users
    */
    @SerializedName("AccessUserCount")
    @Expose
    private Long AccessUserCount;

    /**
    * Number of AKs
    */
    @SerializedName("AccessAkCount")
    @Expose
    private Long AccessAkCount;

    /**
    * Number of roles
    */
    @SerializedName("AccessRoleCount")
    @Expose
    private Long AccessRoleCount;

    /**
     * Get Access methods:
specify users
anonymous access allowed 
     * @return AccessType Access methods:
specify users
anonymous access allowed
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Access methods:
specify users
anonymous access allowed
     * @param AccessType Access methods:
specify users
anonymous access allowed
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Number of users 
     * @return AccessUserCount Number of users
     */
    public Long getAccessUserCount() {
        return this.AccessUserCount;
    }

    /**
     * Set Number of users
     * @param AccessUserCount Number of users
     */
    public void setAccessUserCount(Long AccessUserCount) {
        this.AccessUserCount = AccessUserCount;
    }

    /**
     * Get Number of AKs 
     * @return AccessAkCount Number of AKs
     */
    public Long getAccessAkCount() {
        return this.AccessAkCount;
    }

    /**
     * Set Number of AKs
     * @param AccessAkCount Number of AKs
     */
    public void setAccessAkCount(Long AccessAkCount) {
        this.AccessAkCount = AccessAkCount;
    }

    /**
     * Get Number of roles 
     * @return AccessRoleCount Number of roles
     */
    public Long getAccessRoleCount() {
        return this.AccessRoleCount;
    }

    /**
     * Set Number of roles
     * @param AccessRoleCount Number of roles
     */
    public void setAccessRoleCount(Long AccessRoleCount) {
        this.AccessRoleCount = AccessRoleCount;
    }

    public CosBucketAccessWay() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketAccessWay(CosBucketAccessWay source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.AccessUserCount != null) {
            this.AccessUserCount = new Long(source.AccessUserCount);
        }
        if (source.AccessAkCount != null) {
            this.AccessAkCount = new Long(source.AccessAkCount);
        }
        if (source.AccessRoleCount != null) {
            this.AccessRoleCount = new Long(source.AccessRoleCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AccessUserCount", this.AccessUserCount);
        this.setParamSimple(map, prefix + "AccessAkCount", this.AccessAkCount);
        this.setParamSimple(map, prefix + "AccessRoleCount", this.AccessRoleCount);

    }
}

