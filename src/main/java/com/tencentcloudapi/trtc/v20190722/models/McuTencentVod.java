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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuTencentVod extends AbstractModel {

    /**
    * Post-Upload Task Processing
Automatically initiates task flows after media uploads complete. Value = Task flow template name.
VOD supports creating and naming task flow templates.
Example: template_name
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * Media File Expiration Time
Absolute expiration time from current timestamp.
86400 = 1 day retention
0 = permanent storage (default)
Example: 86400
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Upload Region Specification
For users requiring specific upload regions.
Example: ap-shanghai
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * Category ID
Manages media classification. Obtain via category creation API.
Default: 0 (Other category)
Example: 0
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * VOD SubAppId
Required when accessing sub-application resources. Leave empty otherwise.
Example: 0
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Task Flow Context
Passed through in task completion callbacks.
Example: user_custom
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Upload Context
Passed through in upload completion callbacks.
Example: user_custom
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
     * Get Post-Upload Task Processing
Automatically initiates task flows after media uploads complete. Value = Task flow template name.
VOD supports creating and naming task flow templates.
Example: template_name 
     * @return Procedure Post-Upload Task Processing
Automatically initiates task flows after media uploads complete. Value = Task flow template name.
VOD supports creating and naming task flow templates.
Example: template_name
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Post-Upload Task Processing
Automatically initiates task flows after media uploads complete. Value = Task flow template name.
VOD supports creating and naming task flow templates.
Example: template_name
     * @param Procedure Post-Upload Task Processing
Automatically initiates task flows after media uploads complete. Value = Task flow template name.
VOD supports creating and naming task flow templates.
Example: template_name
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get Media File Expiration Time
Absolute expiration time from current timestamp.
86400 = 1 day retention
0 = permanent storage (default)
Example: 86400 
     * @return ExpireTime Media File Expiration Time
Absolute expiration time from current timestamp.
86400 = 1 day retention
0 = permanent storage (default)
Example: 86400
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Media File Expiration Time
Absolute expiration time from current timestamp.
86400 = 1 day retention
0 = permanent storage (default)
Example: 86400
     * @param ExpireTime Media File Expiration Time
Absolute expiration time from current timestamp.
86400 = 1 day retention
0 = permanent storage (default)
Example: 86400
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Upload Region Specification
For users requiring specific upload regions.
Example: ap-shanghai 
     * @return StorageRegion Upload Region Specification
For users requiring specific upload regions.
Example: ap-shanghai
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Upload Region Specification
For users requiring specific upload regions.
Example: ap-shanghai
     * @param StorageRegion Upload Region Specification
For users requiring specific upload regions.
Example: ap-shanghai
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get Category ID
Manages media classification. Obtain via category creation API.
Default: 0 (Other category)
Example: 0 
     * @return ClassId Category ID
Manages media classification. Obtain via category creation API.
Default: 0 (Other category)
Example: 0
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID
Manages media classification. Obtain via category creation API.
Default: 0 (Other category)
Example: 0
     * @param ClassId Category ID
Manages media classification. Obtain via category creation API.
Default: 0 (Other category)
Example: 0
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get VOD SubAppId
Required when accessing sub-application resources. Leave empty otherwise.
Example: 0 
     * @return SubAppId VOD SubAppId
Required when accessing sub-application resources. Leave empty otherwise.
Example: 0
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD SubAppId
Required when accessing sub-application resources. Leave empty otherwise.
Example: 0
     * @param SubAppId VOD SubAppId
Required when accessing sub-application resources. Leave empty otherwise.
Example: 0
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Task Flow Context
Passed through in task completion callbacks.
Example: user_custom 
     * @return SessionContext Task Flow Context
Passed through in task completion callbacks.
Example: user_custom
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Task Flow Context
Passed through in task completion callbacks.
Example: user_custom
     * @param SessionContext Task Flow Context
Passed through in task completion callbacks.
Example: user_custom
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Upload Context
Passed through in upload completion callbacks.
Example: user_custom 
     * @return SourceContext Upload Context
Passed through in upload completion callbacks.
Example: user_custom
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set Upload Context
Passed through in upload completion callbacks.
Example: user_custom
     * @param SourceContext Upload Context
Passed through in upload completion callbacks.
Example: user_custom
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    public McuTencentVod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuTencentVod(McuTencentVod source) {
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);

    }
}

