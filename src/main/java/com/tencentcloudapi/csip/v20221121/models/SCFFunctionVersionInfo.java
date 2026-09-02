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

public class SCFFunctionVersionInfo extends AbstractModel {

    /**
    * Function version name
Parameter format: $LATEST or a digital version number, such as 1, 2, 3
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version status. The current implementation returns the same value as the Version field.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Function version name
Parameter format: $LATEST or a digital version number, such as 1, 2, 3 
     * @return Version Function version name
Parameter format: $LATEST or a digital version number, such as 1, 2, 3
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Function version name
Parameter format: $LATEST or a digital version number, such as 1, 2, 3
     * @param Version Function version name
Parameter format: $LATEST or a digital version number, such as 1, 2, 3
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version status. The current implementation returns the same value as the Version field. 
     * @return Status Version status. The current implementation returns the same value as the Version field.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Version status. The current implementation returns the same value as the Version field.
     * @param Status Version status. The current implementation returns the same value as the Version field.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public SCFFunctionVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCFFunctionVersionInfo(SCFFunctionVersionInfo source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

