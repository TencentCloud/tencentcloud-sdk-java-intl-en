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

public class QRCodeConfigureInfoForUpdate extends AbstractModel {

    /**
    * QR code inspection switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get QR code inspection switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li> 
     * @return Switch QR code inspection switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set QR code inspection switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>
     * @param Switch QR code inspection switch, optional values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public QRCodeConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QRCodeConfigureInfoForUpdate(QRCodeConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

