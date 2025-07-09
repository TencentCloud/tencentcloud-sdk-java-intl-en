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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserSAMLConfigRequest extends AbstractModel {

    /**
    * Type of the modification operation. `enable`: enable, `disable`: disable, `updateSAML`: modify metadata document.
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * Metadata document, which must be Base64 encoded. This parameter is required only when the value of `Operate` is `updateSAML`.
    */
    @SerializedName("SAMLMetadataDocument")
    @Expose
    private String SAMLMetadataDocument;

    /**
     * Get Type of the modification operation. `enable`: enable, `disable`: disable, `updateSAML`: modify metadata document. 
     * @return Operate Type of the modification operation. `enable`: enable, `disable`: disable, `updateSAML`: modify metadata document.
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set Type of the modification operation. `enable`: enable, `disable`: disable, `updateSAML`: modify metadata document.
     * @param Operate Type of the modification operation. `enable`: enable, `disable`: disable, `updateSAML`: modify metadata document.
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get Metadata document, which must be Base64 encoded. This parameter is required only when the value of `Operate` is `updateSAML`. 
     * @return SAMLMetadataDocument Metadata document, which must be Base64 encoded. This parameter is required only when the value of `Operate` is `updateSAML`.
     */
    public String getSAMLMetadataDocument() {
        return this.SAMLMetadataDocument;
    }

    /**
     * Set Metadata document, which must be Base64 encoded. This parameter is required only when the value of `Operate` is `updateSAML`.
     * @param SAMLMetadataDocument Metadata document, which must be Base64 encoded. This parameter is required only when the value of `Operate` is `updateSAML`.
     */
    public void setSAMLMetadataDocument(String SAMLMetadataDocument) {
        this.SAMLMetadataDocument = SAMLMetadataDocument;
    }

    public UpdateUserSAMLConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserSAMLConfigRequest(UpdateUserSAMLConfigRequest source) {
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.SAMLMetadataDocument != null) {
            this.SAMLMetadataDocument = new String(source.SAMLMetadataDocument);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "SAMLMetadataDocument", this.SAMLMetadataDocument);

    }
}

