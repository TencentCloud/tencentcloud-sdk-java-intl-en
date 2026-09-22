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

public class AiSampleFaceOperation extends AbstractModel {

    /**
    * <p>Operation type. Available values: add, delete, reset. The reset operation will clear the existing face data of the person and add the face data specified by FaceContents.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Human face ID set. This field is required when Type is delete.</p>
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
    * <p>Collection of strings after the face image is <a href="https://tools.ietf.org/html/rfc4648">Base64</a>-encoded. Only jpeg and png image formats are supported.</p><li>This field is required when Type is add or reset.</li><li>Array length limit: 5 images.</li>Note: The image must be a relatively clear photo of a single person's front face, with pixels not less than 200*200.
    */
    @SerializedName("FaceContents")
    @Expose
    private String [] FaceContents;

    /**
     * Get <p>Operation type. Available values: add, delete, reset. The reset operation will clear the existing face data of the person and add the face data specified by FaceContents.</p> 
     * @return Type <p>Operation type. Available values: add, delete, reset. The reset operation will clear the existing face data of the person and add the face data specified by FaceContents.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Operation type. Available values: add, delete, reset. The reset operation will clear the existing face data of the person and add the face data specified by FaceContents.</p>
     * @param Type <p>Operation type. Available values: add, delete, reset. The reset operation will clear the existing face data of the person and add the face data specified by FaceContents.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Human face ID set. This field is required when Type is delete.</p> 
     * @return FaceIds <p>Human face ID set. This field is required when Type is delete.</p>
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set <p>Human face ID set. This field is required when Type is delete.</p>
     * @param FaceIds <p>Human face ID set. This field is required when Type is delete.</p>
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
    }

    /**
     * Get <p>Collection of strings after the face image is <a href="https://tools.ietf.org/html/rfc4648">Base64</a>-encoded. Only jpeg and png image formats are supported.</p><li>This field is required when Type is add or reset.</li><li>Array length limit: 5 images.</li>Note: The image must be a relatively clear photo of a single person's front face, with pixels not less than 200*200. 
     * @return FaceContents <p>Collection of strings after the face image is <a href="https://tools.ietf.org/html/rfc4648">Base64</a>-encoded. Only jpeg and png image formats are supported.</p><li>This field is required when Type is add or reset.</li><li>Array length limit: 5 images.</li>Note: The image must be a relatively clear photo of a single person's front face, with pixels not less than 200*200.
     */
    public String [] getFaceContents() {
        return this.FaceContents;
    }

    /**
     * Set <p>Collection of strings after the face image is <a href="https://tools.ietf.org/html/rfc4648">Base64</a>-encoded. Only jpeg and png image formats are supported.</p><li>This field is required when Type is add or reset.</li><li>Array length limit: 5 images.</li>Note: The image must be a relatively clear photo of a single person's front face, with pixels not less than 200*200.
     * @param FaceContents <p>Collection of strings after the face image is <a href="https://tools.ietf.org/html/rfc4648">Base64</a>-encoded. Only jpeg and png image formats are supported.</p><li>This field is required when Type is add or reset.</li><li>Array length limit: 5 images.</li>Note: The image must be a relatively clear photo of a single person's front face, with pixels not less than 200*200.
     */
    public void setFaceContents(String [] FaceContents) {
        this.FaceContents = FaceContents;
    }

    public AiSampleFaceOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSampleFaceOperation(AiSampleFaceOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FaceIds != null) {
            this.FaceIds = new String[source.FaceIds.length];
            for (int i = 0; i < source.FaceIds.length; i++) {
                this.FaceIds[i] = new String(source.FaceIds[i]);
            }
        }
        if (source.FaceContents != null) {
            this.FaceContents = new String[source.FaceContents.length];
            for (int i = 0; i < source.FaceContents.length; i++) {
                this.FaceContents[i] = new String(source.FaceContents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);
        this.setParamArraySimple(map, prefix + "FaceContents.", this.FaceContents);

    }
}

