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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffInfo extends AbstractModel {

    /**
    * On-duty personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StaffIDs")
    @Expose
    private String [] StaffIDs;

    /**
     * Get On-duty personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StaffIDs On-duty personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getStaffIDs() {
        return this.StaffIDs;
    }

    /**
     * Set On-duty personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StaffIDs On-duty personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStaffIDs(String [] StaffIDs) {
        this.StaffIDs = StaffIDs;
    }

    public StaffInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffInfo(StaffInfo source) {
        if (source.StaffIDs != null) {
            this.StaffIDs = new String[source.StaffIDs.length];
            for (int i = 0; i < source.StaffIDs.length; i++) {
                this.StaffIDs[i] = new String(source.StaffIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StaffIDs.", this.StaffIDs);

    }
}

