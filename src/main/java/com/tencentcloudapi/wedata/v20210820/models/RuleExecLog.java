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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExecLog extends AbstractModel {

    /**
    * Completion Status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Finished")
    @Expose
    private Boolean Finished;

    /**
    * ContentNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
     * Get Completion Status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Finished Completion Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getFinished() {
        return this.Finished;
    }

    /**
     * Set Completion Status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Finished Completion Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFinished(Boolean Finished) {
        this.Finished = Finished;
    }

    /**
     * Get ContentNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Log ContentNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set ContentNote: This field may return null, indicating that no valid value can be obtained.
     * @param Log ContentNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    public RuleExecLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecLog(RuleExecLog source) {
        if (source.Finished != null) {
            this.Finished = new Boolean(source.Finished);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Finished", this.Finished);
        this.setParamSimple(map, prefix + "Log", this.Log);

    }
}

