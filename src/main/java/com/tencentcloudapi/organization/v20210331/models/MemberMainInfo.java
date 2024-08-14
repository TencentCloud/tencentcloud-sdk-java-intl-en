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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberMainInfo extends AbstractModel {

    /**
    * Member UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Member name j.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
     * Get Member UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberUin Member UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Member UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberUin Member UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Member name j.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberName Member name j.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set Member name j.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberName Member name j.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public MemberMainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberMainInfo(MemberMainInfo source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);

    }
}

