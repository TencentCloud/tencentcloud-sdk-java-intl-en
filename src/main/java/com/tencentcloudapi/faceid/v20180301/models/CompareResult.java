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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareResult extends AbstractModel {

    /**
    * The final verification result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * The description of the final verification result.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * The liveness algorithm package generated during this SDK-based liveness detection.
    */
    @SerializedName("LiveData")
    @Expose
    private FileInfo LiveData;

    /**
    * The download URL of the video used for verification, which contains specific color reflection effects, is valid for 10 minutes.
    */
    @SerializedName("LiveVideo")
    @Expose
    private FileInfo LiveVideo;

    /**
    * Records the specific action performed by the user, used for AI Face Shield analysis.
    */
    @SerializedName("ActionVideo")
    @Expose
    private FileInfo ActionVideo;

    /**
    * The liveness detection result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
    */
    @SerializedName("LiveErrorCode")
    @Expose
    private String LiveErrorCode;

    /**
    * The description of the liveness detection result.
    */
    @SerializedName("LiveErrorMsg")
    @Expose
    private String LiveErrorMsg;

    /**
    * The download URL of the face screenshot during verification, which is valid for 10 minutes.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BestFrame")
    @Expose
    private FileInfo BestFrame;

    /**
    * The download URL of the profile photo screenshot from the identity document, which is valid for 10 minutes.
    */
    @SerializedName("ProfileImage")
    @Expose
    private FileInfo ProfileImage;

    /**
    * The face comparison result code.
0: Success.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompareErrorCode")
    @Expose
    private String CompareErrorCode;

    /**
    * The description of the face comparison result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareErrorMsg")
    @Expose
    private String CompareErrorMsg;

    /**
    * The similarity score of face comparison.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * This parameter is disused.
    */
    @SerializedName("IsNeedCharge")
    @Expose
    private Boolean IsNeedCharge;

    /**
    * The identity document photo info edited by the user. Currently, this parameter is not applied.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardInfoInputJson")
    @Expose
    private FileInfo CardInfoInputJson;

    /**
    * The request ID of this verification process.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The final verification result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard. 
     * @return ErrorCode The final verification result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set The final verification result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
     * @param ErrorCode The final verification result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get The description of the final verification result. 
     * @return ErrorMsg The description of the final verification result.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set The description of the final verification result.
     * @param ErrorMsg The description of the final verification result.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get The liveness algorithm package generated during this SDK-based liveness detection. 
     * @return LiveData The liveness algorithm package generated during this SDK-based liveness detection.
     */
    public FileInfo getLiveData() {
        return this.LiveData;
    }

    /**
     * Set The liveness algorithm package generated during this SDK-based liveness detection.
     * @param LiveData The liveness algorithm package generated during this SDK-based liveness detection.
     */
    public void setLiveData(FileInfo LiveData) {
        this.LiveData = LiveData;
    }

    /**
     * Get The download URL of the video used for verification, which contains specific color reflection effects, is valid for 10 minutes. 
     * @return LiveVideo The download URL of the video used for verification, which contains specific color reflection effects, is valid for 10 minutes.
     */
    public FileInfo getLiveVideo() {
        return this.LiveVideo;
    }

    /**
     * Set The download URL of the video used for verification, which contains specific color reflection effects, is valid for 10 minutes.
     * @param LiveVideo The download URL of the video used for verification, which contains specific color reflection effects, is valid for 10 minutes.
     */
    public void setLiveVideo(FileInfo LiveVideo) {
        this.LiveVideo = LiveVideo;
    }

    /**
     * Get Records the specific action performed by the user, used for AI Face Shield analysis. 
     * @return ActionVideo Records the specific action performed by the user, used for AI Face Shield analysis.
     */
    public FileInfo getActionVideo() {
        return this.ActionVideo;
    }

    /**
     * Set Records the specific action performed by the user, used for AI Face Shield analysis.
     * @param ActionVideo Records the specific action performed by the user, used for AI Face Shield analysis.
     */
    public void setActionVideo(FileInfo ActionVideo) {
        this.ActionVideo = ActionVideo;
    }

    /**
     * Get The liveness detection result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed. 
     * @return LiveErrorCode The liveness detection result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
     */
    public String getLiveErrorCode() {
        return this.LiveErrorCode;
    }

    /**
     * Set The liveness detection result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
     * @param LiveErrorCode The liveness detection result code.
0: Success.
1001: Failed to call the liveness detection engine.
1004: Face detection failed.
     */
    public void setLiveErrorCode(String LiveErrorCode) {
        this.LiveErrorCode = LiveErrorCode;
    }

    /**
     * Get The description of the liveness detection result. 
     * @return LiveErrorMsg The description of the liveness detection result.
     */
    public String getLiveErrorMsg() {
        return this.LiveErrorMsg;
    }

    /**
     * Set The description of the liveness detection result.
     * @param LiveErrorMsg The description of the liveness detection result.
     */
    public void setLiveErrorMsg(String LiveErrorMsg) {
        this.LiveErrorMsg = LiveErrorMsg;
    }

    /**
     * Get The download URL of the face screenshot during verification, which is valid for 10 minutes.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BestFrame The download URL of the face screenshot during verification, which is valid for 10 minutes.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public FileInfo getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set The download URL of the face screenshot during verification, which is valid for 10 minutes.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BestFrame The download URL of the face screenshot during verification, which is valid for 10 minutes.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBestFrame(FileInfo BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get The download URL of the profile photo screenshot from the identity document, which is valid for 10 minutes. 
     * @return ProfileImage The download URL of the profile photo screenshot from the identity document, which is valid for 10 minutes.
     */
    public FileInfo getProfileImage() {
        return this.ProfileImage;
    }

    /**
     * Set The download URL of the profile photo screenshot from the identity document, which is valid for 10 minutes.
     * @param ProfileImage The download URL of the profile photo screenshot from the identity document, which is valid for 10 minutes.
     */
    public void setProfileImage(FileInfo ProfileImage) {
        this.ProfileImage = ProfileImage;
    }

    /**
     * Get The face comparison result code.
0: Success.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompareErrorCode The face comparison result code.
0: Success.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCompareErrorCode() {
        return this.CompareErrorCode;
    }

    /**
     * Set The face comparison result code.
0: Success.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompareErrorCode The face comparison result code.
0: Success.
2004: The uploaded face image is too large or too small.
2012: The face is not fully exposed.
2013: No face is detected.
2014: The resolution of the uploaded image is too low . Please upload a new one.
2015: Face comparison failed.
2016: The similarity did not reach the passing standard.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompareErrorCode(String CompareErrorCode) {
        this.CompareErrorCode = CompareErrorCode;
    }

    /**
     * Get The description of the face comparison result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompareErrorMsg The description of the face comparison result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCompareErrorMsg() {
        return this.CompareErrorMsg;
    }

    /**
     * Set The description of the face comparison result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompareErrorMsg The description of the face comparison result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareErrorMsg(String CompareErrorMsg) {
        this.CompareErrorMsg = CompareErrorMsg;
    }

    /**
     * Get The similarity score of face comparison.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sim The similarity score of face comparison.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set The similarity score of face comparison.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sim The similarity score of face comparison.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
    }

    /**
     * Get This parameter is disused. 
     * @return IsNeedCharge This parameter is disused.
     */
    public Boolean getIsNeedCharge() {
        return this.IsNeedCharge;
    }

    /**
     * Set This parameter is disused.
     * @param IsNeedCharge This parameter is disused.
     */
    public void setIsNeedCharge(Boolean IsNeedCharge) {
        this.IsNeedCharge = IsNeedCharge;
    }

    /**
     * Get The identity document photo info edited by the user. Currently, this parameter is not applied.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardInfoInputJson The identity document photo info edited by the user. Currently, this parameter is not applied.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FileInfo getCardInfoInputJson() {
        return this.CardInfoInputJson;
    }

    /**
     * Set The identity document photo info edited by the user. Currently, this parameter is not applied.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardInfoInputJson The identity document photo info edited by the user. Currently, this parameter is not applied.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCardInfoInputJson(FileInfo CardInfoInputJson) {
        this.CardInfoInputJson = CardInfoInputJson;
    }

    /**
     * Get The request ID of this verification process. 
     * @return RequestId The request ID of this verification process.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The request ID of this verification process.
     * @param RequestId The request ID of this verification process.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CompareResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareResult(CompareResult source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.LiveData != null) {
            this.LiveData = new FileInfo(source.LiveData);
        }
        if (source.LiveVideo != null) {
            this.LiveVideo = new FileInfo(source.LiveVideo);
        }
        if (source.ActionVideo != null) {
            this.ActionVideo = new FileInfo(source.ActionVideo);
        }
        if (source.LiveErrorCode != null) {
            this.LiveErrorCode = new String(source.LiveErrorCode);
        }
        if (source.LiveErrorMsg != null) {
            this.LiveErrorMsg = new String(source.LiveErrorMsg);
        }
        if (source.BestFrame != null) {
            this.BestFrame = new FileInfo(source.BestFrame);
        }
        if (source.ProfileImage != null) {
            this.ProfileImage = new FileInfo(source.ProfileImage);
        }
        if (source.CompareErrorCode != null) {
            this.CompareErrorCode = new String(source.CompareErrorCode);
        }
        if (source.CompareErrorMsg != null) {
            this.CompareErrorMsg = new String(source.CompareErrorMsg);
        }
        if (source.Sim != null) {
            this.Sim = new Float(source.Sim);
        }
        if (source.IsNeedCharge != null) {
            this.IsNeedCharge = new Boolean(source.IsNeedCharge);
        }
        if (source.CardInfoInputJson != null) {
            this.CardInfoInputJson = new FileInfo(source.CardInfoInputJson);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamObj(map, prefix + "LiveData.", this.LiveData);
        this.setParamObj(map, prefix + "LiveVideo.", this.LiveVideo);
        this.setParamObj(map, prefix + "ActionVideo.", this.ActionVideo);
        this.setParamSimple(map, prefix + "LiveErrorCode", this.LiveErrorCode);
        this.setParamSimple(map, prefix + "LiveErrorMsg", this.LiveErrorMsg);
        this.setParamObj(map, prefix + "BestFrame.", this.BestFrame);
        this.setParamObj(map, prefix + "ProfileImage.", this.ProfileImage);
        this.setParamSimple(map, prefix + "CompareErrorCode", this.CompareErrorCode);
        this.setParamSimple(map, prefix + "CompareErrorMsg", this.CompareErrorMsg);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "IsNeedCharge", this.IsNeedCharge);
        this.setParamObj(map, prefix + "CardInfoInputJson.", this.CardInfoInputJson);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

