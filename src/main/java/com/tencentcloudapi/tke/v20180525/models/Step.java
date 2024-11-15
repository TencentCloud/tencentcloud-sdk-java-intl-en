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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Step extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Start time

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * End time

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * Current status

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Execution Information

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Start time

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return StartAt Start time

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set Start time

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param StartAt Start time

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get End time

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return EndAt End time

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set End time

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param EndAt End time

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get Current status

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Status Current status

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current status

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Status Current status

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Execution Information

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Message Execution Information

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Execution Information

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Message Execution Information

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Step() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Step(Step source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

