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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAIWorkbenchArtifactDownloadURLRequest extends AbstractModel {

    /**
    * <p>Session ID.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Artifact ID</p>
    */
    @SerializedName("ArtifactId")
    @Expose
    private String ArtifactId;

    /**
     * Get <p>Session ID.</p> 
     * @return SessionId <p>Session ID.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Session ID.</p>
     * @param SessionId <p>Session ID.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Artifact ID</p> 
     * @return ArtifactId <p>Artifact ID</p>
     */
    public String getArtifactId() {
        return this.ArtifactId;
    }

    /**
     * Set <p>Artifact ID</p>
     * @param ArtifactId <p>Artifact ID</p>
     */
    public void setArtifactId(String ArtifactId) {
        this.ArtifactId = ArtifactId;
    }

    public GetAIWorkbenchArtifactDownloadURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAIWorkbenchArtifactDownloadURLRequest(GetAIWorkbenchArtifactDownloadURLRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ArtifactId != null) {
            this.ArtifactId = new String(source.ArtifactId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ArtifactId", this.ArtifactId);

    }
}

