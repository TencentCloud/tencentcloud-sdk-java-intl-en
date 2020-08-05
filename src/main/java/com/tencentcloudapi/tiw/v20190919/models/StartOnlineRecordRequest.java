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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartOnlineRecordRequest extends AbstractModel{

    /**
    * SdkAppId of the customer
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * ID of the room for recording. Value range: (1, 4294967295)
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * User ID used by the real-time recording service for entering a room. Its format is `tic_record_user_${RoomId}_${Random}`, where `${RoomId}` indicates the ID of the room for recording and `${Random}` is a random string.
The ID must be an unused ID in the SDK. The real-time recording service uses the user ID to enter the room for audio, video, and whiteboard recording. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the recording operation.
    */
    @SerializedName("RecordUserId")
    @Expose
    private String RecordUserId;

    /**
    * Signature corresponding to RecordUserId
    */
    @SerializedName("RecordUserSig")
    @Expose
    private String RecordUserSig;

    /**
    * IM group ID of the whiteboard. By default, it is the same as the room ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Real-time recording video splicing parameter
    */
    @SerializedName("Concat")
    @Expose
    private Concat Concat;

    /**
    * Real-time recording whiteboard parameter, such as the whiteboard width and height
    */
    @SerializedName("Whiteboard")
    @Expose
    private Whiteboard Whiteboard;

    /**
    * Real-time recording stream mixing parameter
Notes:
1. The stream mixing feature needs to be enabled separately. If you need the feature, contact TIW customer service.
2. To use the stream mixing feature, the Extras parameter is required and must contain "MIX_STREAM".
    */
    @SerializedName("MixStream")
    @Expose
    private MixStream MixStream;

    /**
    * List of advanced features used
List of possible values:
MIX_STREAM - Stream mixing feature
    */
    @SerializedName("Extras")
    @Expose
    private String [] Extras;

    /**
    * Whether to return the audio-only recording file of different streams in the result callback. The file format is mp3.
    */
    @SerializedName("AudioFileNeeded")
    @Expose
    private Boolean AudioFileNeeded;

    /**
     * Get SdkAppId of the customer 
     * @return SdkAppId SdkAppId of the customer
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the customer
     * @param SdkAppId SdkAppId of the customer
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get ID of the room for recording. Value range: (1, 4294967295) 
     * @return RoomId ID of the room for recording. Value range: (1, 4294967295)
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set ID of the room for recording. Value range: (1, 4294967295)
     * @param RoomId ID of the room for recording. Value range: (1, 4294967295)
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get User ID used by the real-time recording service for entering a room. Its format is `tic_record_user_${RoomId}_${Random}`, where `${RoomId}` indicates the ID of the room for recording and `${Random}` is a random string.
The ID must be an unused ID in the SDK. The real-time recording service uses the user ID to enter the room for audio, video, and whiteboard recording. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the recording operation. 
     * @return RecordUserId User ID used by the real-time recording service for entering a room. Its format is `tic_record_user_${RoomId}_${Random}`, where `${RoomId}` indicates the ID of the room for recording and `${Random}` is a random string.
The ID must be an unused ID in the SDK. The real-time recording service uses the user ID to enter the room for audio, video, and whiteboard recording. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the recording operation.
     */
    public String getRecordUserId() {
        return this.RecordUserId;
    }

    /**
     * Set User ID used by the real-time recording service for entering a room. Its format is `tic_record_user_${RoomId}_${Random}`, where `${RoomId}` indicates the ID of the room for recording and `${Random}` is a random string.
The ID must be an unused ID in the SDK. The real-time recording service uses the user ID to enter the room for audio, video, and whiteboard recording. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the recording operation.
     * @param RecordUserId User ID used by the real-time recording service for entering a room. Its format is `tic_record_user_${RoomId}_${Random}`, where `${RoomId}` indicates the ID of the room for recording and `${Random}` is a random string.
The ID must be an unused ID in the SDK. The real-time recording service uses the user ID to enter the room for audio, video, and whiteboard recording. If this ID is already used in the SDK, the SDK and recording service will conflict, affecting the recording operation.
     */
    public void setRecordUserId(String RecordUserId) {
        this.RecordUserId = RecordUserId;
    }

    /**
     * Get Signature corresponding to RecordUserId 
     * @return RecordUserSig Signature corresponding to RecordUserId
     */
    public String getRecordUserSig() {
        return this.RecordUserSig;
    }

    /**
     * Set Signature corresponding to RecordUserId
     * @param RecordUserSig Signature corresponding to RecordUserId
     */
    public void setRecordUserSig(String RecordUserSig) {
        this.RecordUserSig = RecordUserSig;
    }

    /**
     * Get IM group ID of the whiteboard. By default, it is the same as the room ID. 
     * @return GroupId IM group ID of the whiteboard. By default, it is the same as the room ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set IM group ID of the whiteboard. By default, it is the same as the room ID.
     * @param GroupId IM group ID of the whiteboard. By default, it is the same as the room ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Real-time recording video splicing parameter 
     * @return Concat Real-time recording video splicing parameter
     */
    public Concat getConcat() {
        return this.Concat;
    }

    /**
     * Set Real-time recording video splicing parameter
     * @param Concat Real-time recording video splicing parameter
     */
    public void setConcat(Concat Concat) {
        this.Concat = Concat;
    }

    /**
     * Get Real-time recording whiteboard parameter, such as the whiteboard width and height 
     * @return Whiteboard Real-time recording whiteboard parameter, such as the whiteboard width and height
     */
    public Whiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set Real-time recording whiteboard parameter, such as the whiteboard width and height
     * @param Whiteboard Real-time recording whiteboard parameter, such as the whiteboard width and height
     */
    public void setWhiteboard(Whiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    /**
     * Get Real-time recording stream mixing parameter
Notes:
1. The stream mixing feature needs to be enabled separately. If you need the feature, contact TIW customer service.
2. To use the stream mixing feature, the Extras parameter is required and must contain "MIX_STREAM". 
     * @return MixStream Real-time recording stream mixing parameter
Notes:
1. The stream mixing feature needs to be enabled separately. If you need the feature, contact TIW customer service.
2. To use the stream mixing feature, the Extras parameter is required and must contain "MIX_STREAM".
     */
    public MixStream getMixStream() {
        return this.MixStream;
    }

    /**
     * Set Real-time recording stream mixing parameter
Notes:
1. The stream mixing feature needs to be enabled separately. If you need the feature, contact TIW customer service.
2. To use the stream mixing feature, the Extras parameter is required and must contain "MIX_STREAM".
     * @param MixStream Real-time recording stream mixing parameter
Notes:
1. The stream mixing feature needs to be enabled separately. If you need the feature, contact TIW customer service.
2. To use the stream mixing feature, the Extras parameter is required and must contain "MIX_STREAM".
     */
    public void setMixStream(MixStream MixStream) {
        this.MixStream = MixStream;
    }

    /**
     * Get List of advanced features used
List of possible values:
MIX_STREAM - Stream mixing feature 
     * @return Extras List of advanced features used
List of possible values:
MIX_STREAM - Stream mixing feature
     */
    public String [] getExtras() {
        return this.Extras;
    }

    /**
     * Set List of advanced features used
List of possible values:
MIX_STREAM - Stream mixing feature
     * @param Extras List of advanced features used
List of possible values:
MIX_STREAM - Stream mixing feature
     */
    public void setExtras(String [] Extras) {
        this.Extras = Extras;
    }

    /**
     * Get Whether to return the audio-only recording file of different streams in the result callback. The file format is mp3. 
     * @return AudioFileNeeded Whether to return the audio-only recording file of different streams in the result callback. The file format is mp3.
     */
    public Boolean getAudioFileNeeded() {
        return this.AudioFileNeeded;
    }

    /**
     * Set Whether to return the audio-only recording file of different streams in the result callback. The file format is mp3.
     * @param AudioFileNeeded Whether to return the audio-only recording file of different streams in the result callback. The file format is mp3.
     */
    public void setAudioFileNeeded(Boolean AudioFileNeeded) {
        this.AudioFileNeeded = AudioFileNeeded;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RecordUserId", this.RecordUserId);
        this.setParamSimple(map, prefix + "RecordUserSig", this.RecordUserSig);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "Concat.", this.Concat);
        this.setParamObj(map, prefix + "Whiteboard.", this.Whiteboard);
        this.setParamObj(map, prefix + "MixStream.", this.MixStream);
        this.setParamArraySimple(map, prefix + "Extras.", this.Extras);
        this.setParamSimple(map, prefix + "AudioFileNeeded", this.AudioFileNeeded);

    }
}

