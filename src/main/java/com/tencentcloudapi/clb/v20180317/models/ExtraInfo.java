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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraInfo extends AbstractModel{

    /**
    * Whether to enable VIP direct connection
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZhiTong")
    @Expose
    private Boolean ZhiTong;

    /**
    * TgwGroup name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TgwGroupName")
    @Expose
    private String TgwGroupName;

    /**
     * Get Whether to enable VIP direct connection
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZhiTong Whether to enable VIP direct connection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getZhiTong() {
        return this.ZhiTong;
    }

    /**
     * Set Whether to enable VIP direct connection
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZhiTong Whether to enable VIP direct connection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZhiTong(Boolean ZhiTong) {
        this.ZhiTong = ZhiTong;
    }

    /**
     * Get TgwGroup name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TgwGroupName TgwGroup name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTgwGroupName() {
        return this.TgwGroupName;
    }

    /**
     * Set TgwGroup name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TgwGroupName TgwGroup name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTgwGroupName(String TgwGroupName) {
        this.TgwGroupName = TgwGroupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZhiTong", this.ZhiTong);
        this.setParamSimple(map, prefix + "TgwGroupName", this.TgwGroupName);

    }
}

