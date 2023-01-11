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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ability extends AbstractModel{

    /**
    * Whether secondary AZ is supported
    */
    @SerializedName("IsSupportSlaveZone")
    @Expose
    private String IsSupportSlaveZone;

    /**
    * The reason why secondary AZ is not supported
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NonsupportSlaveZoneReason")
    @Expose
    private String NonsupportSlaveZoneReason;

    /**
    * Whether read-only instance is supported
    */
    @SerializedName("IsSupportRo")
    @Expose
    private String IsSupportRo;

    /**
    * The reason why read-only instance is not supported
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NonsupportRoReason")
    @Expose
    private String NonsupportRoReason;

    /**
     * Get Whether secondary AZ is supported 
     * @return IsSupportSlaveZone Whether secondary AZ is supported
     */
    public String getIsSupportSlaveZone() {
        return this.IsSupportSlaveZone;
    }

    /**
     * Set Whether secondary AZ is supported
     * @param IsSupportSlaveZone Whether secondary AZ is supported
     */
    public void setIsSupportSlaveZone(String IsSupportSlaveZone) {
        this.IsSupportSlaveZone = IsSupportSlaveZone;
    }

    /**
     * Get The reason why secondary AZ is not supported
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NonsupportSlaveZoneReason The reason why secondary AZ is not supported
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNonsupportSlaveZoneReason() {
        return this.NonsupportSlaveZoneReason;
    }

    /**
     * Set The reason why secondary AZ is not supported
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NonsupportSlaveZoneReason The reason why secondary AZ is not supported
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNonsupportSlaveZoneReason(String NonsupportSlaveZoneReason) {
        this.NonsupportSlaveZoneReason = NonsupportSlaveZoneReason;
    }

    /**
     * Get Whether read-only instance is supported 
     * @return IsSupportRo Whether read-only instance is supported
     */
    public String getIsSupportRo() {
        return this.IsSupportRo;
    }

    /**
     * Set Whether read-only instance is supported
     * @param IsSupportRo Whether read-only instance is supported
     */
    public void setIsSupportRo(String IsSupportRo) {
        this.IsSupportRo = IsSupportRo;
    }

    /**
     * Get The reason why read-only instance is not supported
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NonsupportRoReason The reason why read-only instance is not supported
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNonsupportRoReason() {
        return this.NonsupportRoReason;
    }

    /**
     * Set The reason why read-only instance is not supported
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NonsupportRoReason The reason why read-only instance is not supported
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNonsupportRoReason(String NonsupportRoReason) {
        this.NonsupportRoReason = NonsupportRoReason;
    }

    public Ability() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ability(Ability source) {
        if (source.IsSupportSlaveZone != null) {
            this.IsSupportSlaveZone = new String(source.IsSupportSlaveZone);
        }
        if (source.NonsupportSlaveZoneReason != null) {
            this.NonsupportSlaveZoneReason = new String(source.NonsupportSlaveZoneReason);
        }
        if (source.IsSupportRo != null) {
            this.IsSupportRo = new String(source.IsSupportRo);
        }
        if (source.NonsupportRoReason != null) {
            this.NonsupportRoReason = new String(source.NonsupportRoReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupportSlaveZone", this.IsSupportSlaveZone);
        this.setParamSimple(map, prefix + "NonsupportSlaveZoneReason", this.NonsupportSlaveZoneReason);
        this.setParamSimple(map, prefix + "IsSupportRo", this.IsSupportRo);
        this.setParamSimple(map, prefix + "NonsupportRoReason", this.NonsupportRoReason);

    }
}

