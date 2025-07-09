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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormalLog extends AbstractModel {

    /**
    * Timestamp in milliseconds.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Log level.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SeverityText")
    @Expose
    private String SeverityText;

    /**
    * Log output content.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
     * Get Timestamp in milliseconds.

Note: This field may return null, indicating that no valid value is found. 
     * @return Timestamp Timestamp in milliseconds.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Timestamp in milliseconds.

Note: This field may return null, indicating that no valid value is found.
     * @param Timestamp Timestamp in milliseconds.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Log level.

Note: This field may return null, indicating that no valid value is found. 
     * @return SeverityText Log level.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getSeverityText() {
        return this.SeverityText;
    }

    /**
     * Set Log level.

Note: This field may return null, indicating that no valid value is found.
     * @param SeverityText Log level.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSeverityText(String SeverityText) {
        this.SeverityText = SeverityText;
    }

    /**
     * Get Log output content.

Note: This field may return null, indicating that no valid value is found. 
     * @return Body Log output content.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set Log output content.

Note: This field may return null, indicating that no valid value is found.
     * @param Body Log output content.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    public NormalLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalLog(NormalLog source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.SeverityText != null) {
            this.SeverityText = new String(source.SeverityText);
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SeverityText", this.SeverityText);
        this.setParamSimple(map, prefix + "Body", this.Body);

    }
}

