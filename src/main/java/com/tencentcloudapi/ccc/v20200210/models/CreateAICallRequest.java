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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAICallRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Called number.
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up.
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * Model interface protocol types, currently compatible with three protocol types:

- OpenAI protocol (including GPT, Hunyuan, DeepSeek, etc.):"openai"
- Azure protocol:"azure"
- Minimax protocol:"minimax"
    */
    @SerializedName("LLMType")
    @Expose
    private String LLMType;

    /**
    * Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","hunyuan-standard", "hunyuan-turbo","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat".
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [Hunyuan](https://intl.cloud.tencent.com/document/product/1729/111008?from_cn_redirect=1), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Hunyuan:"https://api.hunyuan.cloud.tencent.com/v1"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1"
    */
    @SerializedName("APIUrl")
    @Expose
    private String APIUrl;

    /**
    * The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy


    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * List of calling numbers.
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * Used to set the AI Agent Greeting.
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt
    */
    @SerializedName("WelcomeType")
    @Expose
    private Long WelcomeType;

    /**
    * Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * Interrupt AI speech mode, default is 0, 0 indicates the server interrupts automatically, 1 indicates the server does not interrupt, interruption signal sent by the client side.
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts.
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * Whether the model supports (or enables) call_end function calling
    */
    @SerializedName("EndFunctionEnable")
    @Expose
    private Boolean EndFunctionEnable;

    /**
    * Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so."
    */
    @SerializedName("EndFunctionDesc")
    @Expose
    private String EndFunctionDesc;

    /**
    * The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds
    */
    @SerializedName("NotifyDuration")
    @Expose
    private Long NotifyDuration;

    /**
    * The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?"
    */
    @SerializedName("NotifyMessage")
    @Expose
    private String NotifyMessage;

    /**
    * <p>And VoiceType field needs to select one, here is to use your own custom TTS, VoiceType is some built-in sound qualities</p>
<ul>
<li>Tencent TTS<br>
For configuration, please refer to <a href="https://intl.cloud.tencent.com/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">Tencent Cloud TTS documentation link</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS type, currently supports &quot;tencent&quot; and "minixmax", other vendors support in progress
    &quot;AppId&quot;: &quot;Your application ID&quot;, // String required
    &quot;SecretId&quot;: &quot;Your Secret ID&quot;, // String Required
    &quot;SecretKey&quot;:  &quot;Your Secret Key&quot;, // String Required
    &quot;VoiceType&quot;: 101001, // Integer Required, Sound quality ID, includes standard and premium sound quality. Premium sound quality is more realistic and differently priced than standard sound quality. See TTS billing overview for details. For the full list of sound quality IDs, see the TTS sound quality list.
    "Speed": 1.25, // Integer Optional, speech speed, range: [-2,6], corresponding to different speeds: -2: represents 0.6x -1: represents 0.8x 0: represents 1.0x (default) 1: represents 1.2x 2: represents 1.5x 6: represents 2.5x For more precise speed control, you can retain two decimal places, such as 0.5/1.25/2.81, etc. For parameter value to actual speed conversion, refer to Speed Conversion
    &quot;Volume&quot;: 5, // Integer Optional, Volume level, range: [0,10], corresponding to 11 levels of volume, default is 0, which represents normal volume.
    &quot;PrimaryLanguage&quot;: 1, // Integer Optional, Primary language 1- Chinese (default) 2- English 3- Japanese
    &quot;FastVoiceType&quot;: &quot;xxxx&quot;   // Optional parameter, Fast VRS parameter
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
For configuration, please refer to the <a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. Note that Minimax TTS has frequency limits, and exceeding the limit may cause response delays, <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit related documentation link</a>.</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS type,
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-yujie&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>Volcano TTS</li>
</ul>
<p>For type of sound quality configuration, refer to the<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">Volcano TTS documentation</a><br>
TTS Sound Quality List - Voice Technology - Volcano Engine<br>
Large Model TTS Sound Quality List - Voice Technology - Volcano Engine</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // Required: String TTS type
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // Required: String Volcano Engine assigned AppId
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // Required: String type Volcano Engine access token
    &quot;Speed&quot; : 1.0,            // Optional parameter: Playback speed, default is 1.0
    &quot;Volume&quot;: 1.0,            // Optional parameter: Volume, default is 1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // Optional parameter: Business cluster, default is volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // Sound quality type, default is the sound quality of the large model TTS. If using normal TTS, fill in the corresponding sound quality type. Incorrect sound quality type will result in no sound.
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
For configuration, refer to the<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">Azure TTS documentation</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // Required: String TTS type
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // Required: String subscription key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // Required: String subscription region
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // Required: String Timbre Name required
    &quot;Language&quot;: &quot;zh-CN&quot;, // Required: String Language for synthesis
    &quot;Rate&quot;: 1 // Optional: float Playback Speed 0.5-2 default is 1
}
</code></pre>

</div></div><ul>
<li>Custom</li>
</ul>
<p>TTS<br>
Please refer to the specific protocol standards in the <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">Tencent documentation</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // Required String
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // Required String for Authentication
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // Required String, TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, optional, expected audio format, such as mp3, ogg_opus, pcm, wav, default is wav, currently only pcm and wav are supported,
  &quot;SampleRate&quot;: 16000,  // Integer, optional, audio sample rate, default is 16000 (16k), recommended value is 16000
  &quot;AudioChannel&quot;: 1,    // Integer, optional, number of audio channels, values: 1 or 2, default is 1
}
</code></pre>

</div></div>
    */
    @SerializedName("CustomTTSConfig")
    @Expose
    private String CustomTTSConfig;

    /**
     * Get Application ID (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Called number. 
     * @return Callee Called number.
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set Called number.
     * @param Callee Called number.
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up. 
     * @return SystemPrompt ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up.
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up.
     * @param SystemPrompt ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up.
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get Model interface protocol types, currently compatible with three protocol types:

- OpenAI protocol (including GPT, Hunyuan, DeepSeek, etc.):"openai"
- Azure protocol:"azure"
- Minimax protocol:"minimax" 
     * @return LLMType Model interface protocol types, currently compatible with three protocol types:

- OpenAI protocol (including GPT, Hunyuan, DeepSeek, etc.):"openai"
- Azure protocol:"azure"
- Minimax protocol:"minimax"
     */
    public String getLLMType() {
        return this.LLMType;
    }

    /**
     * Set Model interface protocol types, currently compatible with three protocol types:

- OpenAI protocol (including GPT, Hunyuan, DeepSeek, etc.):"openai"
- Azure protocol:"azure"
- Minimax protocol:"minimax"
     * @param LLMType Model interface protocol types, currently compatible with three protocol types:

- OpenAI protocol (including GPT, Hunyuan, DeepSeek, etc.):"openai"
- Azure protocol:"azure"
- Minimax protocol:"minimax"
     */
    public void setLLMType(String LLMType) {
        this.LLMType = LLMType;
    }

    /**
     * Get Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","hunyuan-standard", "hunyuan-turbo","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat". 
     * @return Model Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","hunyuan-standard", "hunyuan-turbo","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat".
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","hunyuan-standard", "hunyuan-turbo","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat".
     * @param Model Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","hunyuan-standard", "hunyuan-turbo","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat".
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [Hunyuan](https://intl.cloud.tencent.com/document/product/1729/111008?from_cn_redirect=1), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2) 
     * @return APIKey Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [Hunyuan](https://intl.cloud.tencent.com/document/product/1729/111008?from_cn_redirect=1), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [Hunyuan](https://intl.cloud.tencent.com/document/product/1729/111008?from_cn_redirect=1), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     * @param APIKey Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [Hunyuan](https://intl.cloud.tencent.com/document/product/1729/111008?from_cn_redirect=1), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Hunyuan:"https://api.hunyuan.cloud.tencent.com/v1"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1" 
     * @return APIUrl Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Hunyuan:"https://api.hunyuan.cloud.tencent.com/v1"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1"
     */
    public String getAPIUrl() {
        return this.APIUrl;
    }

    /**
     * Set Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Hunyuan:"https://api.hunyuan.cloud.tencent.com/v1"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1"
     * @param APIUrl Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Hunyuan:"https://api.hunyuan.cloud.tencent.com/v1"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1"
     */
    public void setAPIUrl(String APIUrl) {
        this.APIUrl = APIUrl;
    }

    /**
     * Get The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy

 
     * @return VoiceType The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy


     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy


     * @param VoiceType The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy


     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get List of calling numbers. 
     * @return Callers List of calling numbers.
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set List of calling numbers.
     * @param Callers List of calling numbers.
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get Used to set the AI Agent Greeting. 
     * @return WelcomeMessage Used to set the AI Agent Greeting.
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set Used to set the AI Agent Greeting.
     * @param WelcomeMessage Used to set the AI Agent Greeting.
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt 
     * @return WelcomeType 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt
     */
    public Long getWelcomeType() {
        return this.WelcomeType;
    }

    /**
     * Set 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt
     * @param WelcomeType 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt
     */
    public void setWelcomeType(Long WelcomeType) {
        this.WelcomeType = WelcomeType;
    }

    /**
     * Get Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated 
     * @return MaxDuration Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated
     * @param MaxDuration Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian 
     * @return Languages ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian
     * @param Languages ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get Interrupt AI speech mode, default is 0, 0 indicates the server interrupts automatically, 1 indicates the server does not interrupt, interruption signal sent by the client side. 
     * @return InterruptMode Interrupt AI speech mode, default is 0, 0 indicates the server interrupts automatically, 1 indicates the server does not interrupt, interruption signal sent by the client side.
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set Interrupt AI speech mode, default is 0, 0 indicates the server interrupts automatically, 1 indicates the server does not interrupt, interruption signal sent by the client side.
     * @param InterruptMode Interrupt AI speech mode, default is 0, 0 indicates the server interrupts automatically, 1 indicates the server does not interrupt, interruption signal sent by the client side.
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts. 
     * @return InterruptSpeechDuration Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts.
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts.
     * @param InterruptSpeechDuration Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts.
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get Whether the model supports (or enables) call_end function calling 
     * @return EndFunctionEnable Whether the model supports (or enables) call_end function calling
     */
    public Boolean getEndFunctionEnable() {
        return this.EndFunctionEnable;
    }

    /**
     * Set Whether the model supports (or enables) call_end function calling
     * @param EndFunctionEnable Whether the model supports (or enables) call_end function calling
     */
    public void setEndFunctionEnable(Boolean EndFunctionEnable) {
        this.EndFunctionEnable = EndFunctionEnable;
    }

    /**
     * Get Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so." 
     * @return EndFunctionDesc Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so."
     */
    public String getEndFunctionDesc() {
        return this.EndFunctionDesc;
    }

    /**
     * Set Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so."
     * @param EndFunctionDesc Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so."
     */
    public void setEndFunctionDesc(String EndFunctionDesc) {
        this.EndFunctionDesc = EndFunctionDesc;
    }

    /**
     * Get The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds 
     * @return NotifyDuration The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds
     */
    public Long getNotifyDuration() {
        return this.NotifyDuration;
    }

    /**
     * Set The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds
     * @param NotifyDuration The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds
     */
    public void setNotifyDuration(Long NotifyDuration) {
        this.NotifyDuration = NotifyDuration;
    }

    /**
     * Get The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?" 
     * @return NotifyMessage The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?"
     */
    public String getNotifyMessage() {
        return this.NotifyMessage;
    }

    /**
     * Set The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?"
     * @param NotifyMessage The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?"
     */
    public void setNotifyMessage(String NotifyMessage) {
        this.NotifyMessage = NotifyMessage;
    }

    /**
     * Get <p>And VoiceType field needs to select one, here is to use your own custom TTS, VoiceType is some built-in sound qualities</p>
<ul>
<li>Tencent TTS<br>
For configuration, please refer to <a href="https://intl.cloud.tencent.com/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">Tencent Cloud TTS documentation link</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS type, currently supports &quot;tencent&quot; and "minixmax", other vendors support in progress
    &quot;AppId&quot;: &quot;Your application ID&quot;, // String required
    &quot;SecretId&quot;: &quot;Your Secret ID&quot;, // String Required
    &quot;SecretKey&quot;:  &quot;Your Secret Key&quot;, // String Required
    &quot;VoiceType&quot;: 101001, // Integer Required, Sound quality ID, includes standard and premium sound quality. Premium sound quality is more realistic and differently priced than standard sound quality. See TTS billing overview for details. For the full list of sound quality IDs, see the TTS sound quality list.
    "Speed": 1.25, // Integer Optional, speech speed, range: [-2,6], corresponding to different speeds: -2: represents 0.6x -1: represents 0.8x 0: represents 1.0x (default) 1: represents 1.2x 2: represents 1.5x 6: represents 2.5x For more precise speed control, you can retain two decimal places, such as 0.5/1.25/2.81, etc. For parameter value to actual speed conversion, refer to Speed Conversion
    &quot;Volume&quot;: 5, // Integer Optional, Volume level, range: [0,10], corresponding to 11 levels of volume, default is 0, which represents normal volume.
    &quot;PrimaryLanguage&quot;: 1, // Integer Optional, Primary language 1- Chinese (default) 2- English 3- Japanese
    &quot;FastVoiceType&quot;: &quot;xxxx&quot;   // Optional parameter, Fast VRS parameter
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
For configuration, please refer to the <a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. Note that Minimax TTS has frequency limits, and exceeding the limit may cause response delays, <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit related documentation link</a>.</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS type,
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-yujie&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>Volcano TTS</li>
</ul>
<p>For type of sound quality configuration, refer to the<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">Volcano TTS documentation</a><br>
TTS Sound Quality List - Voice Technology - Volcano Engine<br>
Large Model TTS Sound Quality List - Voice Technology - Volcano Engine</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // Required: String TTS type
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // Required: String Volcano Engine assigned AppId
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // Required: String type Volcano Engine access token
    &quot;Speed&quot; : 1.0,            // Optional parameter: Playback speed, default is 1.0
    &quot;Volume&quot;: 1.0,            // Optional parameter: Volume, default is 1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // Optional parameter: Business cluster, default is volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // Sound quality type, default is the sound quality of the large model TTS. If using normal TTS, fill in the corresponding sound quality type. Incorrect sound quality type will result in no sound.
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
For configuration, refer to the<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">Azure TTS documentation</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // Required: String TTS type
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // Required: String subscription key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // Required: String subscription region
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // Required: String Timbre Name required
    &quot;Language&quot;: &quot;zh-CN&quot;, // Required: String Language for synthesis
    &quot;Rate&quot;: 1 // Optional: float Playback Speed 0.5-2 default is 1
}
</code></pre>

</div></div><ul>
<li>Custom</li>
</ul>
<p>TTS<br>
Please refer to the specific protocol standards in the <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">Tencent documentation</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // Required String
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // Required String for Authentication
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // Required String, TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, optional, expected audio format, such as mp3, ogg_opus, pcm, wav, default is wav, currently only pcm and wav are supported,
  &quot;SampleRate&quot;: 16000,  // Integer, optional, audio sample rate, default is 16000 (16k), recommended value is 16000
  &quot;AudioChannel&quot;: 1,    // Integer, optional, number of audio channels, values: 1 or 2, default is 1
}
</code></pre>

</div></div> 
     * @return CustomTTSConfig <p>And VoiceType field needs to select one, here is to use your own custom TTS, VoiceType is some built-in sound qualities</p>
<ul>
<li>Tencent TTS<br>
For configuration, please refer to <a href="https://intl.cloud.tencent.com/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">Tencent Cloud TTS documentation link</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS type, currently supports &quot;tencent&quot; and "minixmax", other vendors support in progress
    &quot;AppId&quot;: &quot;Your application ID&quot;, // String required
    &quot;SecretId&quot;: &quot;Your Secret ID&quot;, // String Required
    &quot;SecretKey&quot;:  &quot;Your Secret Key&quot;, // String Required
    &quot;VoiceType&quot;: 101001, // Integer Required, Sound quality ID, includes standard and premium sound quality. Premium sound quality is more realistic and differently priced than standard sound quality. See TTS billing overview for details. For the full list of sound quality IDs, see the TTS sound quality list.
    "Speed": 1.25, // Integer Optional, speech speed, range: [-2,6], corresponding to different speeds: -2: represents 0.6x -1: represents 0.8x 0: represents 1.0x (default) 1: represents 1.2x 2: represents 1.5x 6: represents 2.5x For more precise speed control, you can retain two decimal places, such as 0.5/1.25/2.81, etc. For parameter value to actual speed conversion, refer to Speed Conversion
    &quot;Volume&quot;: 5, // Integer Optional, Volume level, range: [0,10], corresponding to 11 levels of volume, default is 0, which represents normal volume.
    &quot;PrimaryLanguage&quot;: 1, // Integer Optional, Primary language 1- Chinese (default) 2- English 3- Japanese
    &quot;FastVoiceType&quot;: &quot;xxxx&quot;   // Optional parameter, Fast VRS parameter
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
For configuration, please refer to the <a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. Note that Minimax TTS has frequency limits, and exceeding the limit may cause response delays, <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit related documentation link</a>.</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS type,
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-yujie&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>Volcano TTS</li>
</ul>
<p>For type of sound quality configuration, refer to the<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">Volcano TTS documentation</a><br>
TTS Sound Quality List - Voice Technology - Volcano Engine<br>
Large Model TTS Sound Quality List - Voice Technology - Volcano Engine</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // Required: String TTS type
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // Required: String Volcano Engine assigned AppId
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // Required: String type Volcano Engine access token
    &quot;Speed&quot; : 1.0,            // Optional parameter: Playback speed, default is 1.0
    &quot;Volume&quot;: 1.0,            // Optional parameter: Volume, default is 1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // Optional parameter: Business cluster, default is volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // Sound quality type, default is the sound quality of the large model TTS. If using normal TTS, fill in the corresponding sound quality type. Incorrect sound quality type will result in no sound.
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
For configuration, refer to the<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">Azure TTS documentation</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // Required: String TTS type
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // Required: String subscription key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // Required: String subscription region
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // Required: String Timbre Name required
    &quot;Language&quot;: &quot;zh-CN&quot;, // Required: String Language for synthesis
    &quot;Rate&quot;: 1 // Optional: float Playback Speed 0.5-2 default is 1
}
</code></pre>

</div></div><ul>
<li>Custom</li>
</ul>
<p>TTS<br>
Please refer to the specific protocol standards in the <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">Tencent documentation</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // Required String
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // Required String for Authentication
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // Required String, TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, optional, expected audio format, such as mp3, ogg_opus, pcm, wav, default is wav, currently only pcm and wav are supported,
  &quot;SampleRate&quot;: 16000,  // Integer, optional, audio sample rate, default is 16000 (16k), recommended value is 16000
  &quot;AudioChannel&quot;: 1,    // Integer, optional, number of audio channels, values: 1 or 2, default is 1
}
</code></pre>

</div></div>
     */
    public String getCustomTTSConfig() {
        return this.CustomTTSConfig;
    }

    /**
     * Set <p>And VoiceType field needs to select one, here is to use your own custom TTS, VoiceType is some built-in sound qualities</p>
<ul>
<li>Tencent TTS<br>
For configuration, please refer to <a href="https://intl.cloud.tencent.com/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">Tencent Cloud TTS documentation link</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS type, currently supports &quot;tencent&quot; and "minixmax", other vendors support in progress
    &quot;AppId&quot;: &quot;Your application ID&quot;, // String required
    &quot;SecretId&quot;: &quot;Your Secret ID&quot;, // String Required
    &quot;SecretKey&quot;:  &quot;Your Secret Key&quot;, // String Required
    &quot;VoiceType&quot;: 101001, // Integer Required, Sound quality ID, includes standard and premium sound quality. Premium sound quality is more realistic and differently priced than standard sound quality. See TTS billing overview for details. For the full list of sound quality IDs, see the TTS sound quality list.
    "Speed": 1.25, // Integer Optional, speech speed, range: [-2,6], corresponding to different speeds: -2: represents 0.6x -1: represents 0.8x 0: represents 1.0x (default) 1: represents 1.2x 2: represents 1.5x 6: represents 2.5x For more precise speed control, you can retain two decimal places, such as 0.5/1.25/2.81, etc. For parameter value to actual speed conversion, refer to Speed Conversion
    &quot;Volume&quot;: 5, // Integer Optional, Volume level, range: [0,10], corresponding to 11 levels of volume, default is 0, which represents normal volume.
    &quot;PrimaryLanguage&quot;: 1, // Integer Optional, Primary language 1- Chinese (default) 2- English 3- Japanese
    &quot;FastVoiceType&quot;: &quot;xxxx&quot;   // Optional parameter, Fast VRS parameter
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
For configuration, please refer to the <a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. Note that Minimax TTS has frequency limits, and exceeding the limit may cause response delays, <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit related documentation link</a>.</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS type,
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-yujie&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>Volcano TTS</li>
</ul>
<p>For type of sound quality configuration, refer to the<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">Volcano TTS documentation</a><br>
TTS Sound Quality List - Voice Technology - Volcano Engine<br>
Large Model TTS Sound Quality List - Voice Technology - Volcano Engine</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // Required: String TTS type
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // Required: String Volcano Engine assigned AppId
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // Required: String type Volcano Engine access token
    &quot;Speed&quot; : 1.0,            // Optional parameter: Playback speed, default is 1.0
    &quot;Volume&quot;: 1.0,            // Optional parameter: Volume, default is 1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // Optional parameter: Business cluster, default is volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // Sound quality type, default is the sound quality of the large model TTS. If using normal TTS, fill in the corresponding sound quality type. Incorrect sound quality type will result in no sound.
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
For configuration, refer to the<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">Azure TTS documentation</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // Required: String TTS type
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // Required: String subscription key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // Required: String subscription region
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // Required: String Timbre Name required
    &quot;Language&quot;: &quot;zh-CN&quot;, // Required: String Language for synthesis
    &quot;Rate&quot;: 1 // Optional: float Playback Speed 0.5-2 default is 1
}
</code></pre>

</div></div><ul>
<li>Custom</li>
</ul>
<p>TTS<br>
Please refer to the specific protocol standards in the <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">Tencent documentation</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // Required String
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // Required String for Authentication
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // Required String, TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, optional, expected audio format, such as mp3, ogg_opus, pcm, wav, default is wav, currently only pcm and wav are supported,
  &quot;SampleRate&quot;: 16000,  // Integer, optional, audio sample rate, default is 16000 (16k), recommended value is 16000
  &quot;AudioChannel&quot;: 1,    // Integer, optional, number of audio channels, values: 1 or 2, default is 1
}
</code></pre>

</div></div>
     * @param CustomTTSConfig <p>And VoiceType field needs to select one, here is to use your own custom TTS, VoiceType is some built-in sound qualities</p>
<ul>
<li>Tencent TTS<br>
For configuration, please refer to <a href="https://intl.cloud.tencent.com/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">Tencent Cloud TTS documentation link</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS type, currently supports &quot;tencent&quot; and "minixmax", other vendors support in progress
    &quot;AppId&quot;: &quot;Your application ID&quot;, // String required
    &quot;SecretId&quot;: &quot;Your Secret ID&quot;, // String Required
    &quot;SecretKey&quot;:  &quot;Your Secret Key&quot;, // String Required
    &quot;VoiceType&quot;: 101001, // Integer Required, Sound quality ID, includes standard and premium sound quality. Premium sound quality is more realistic and differently priced than standard sound quality. See TTS billing overview for details. For the full list of sound quality IDs, see the TTS sound quality list.
    "Speed": 1.25, // Integer Optional, speech speed, range: [-2,6], corresponding to different speeds: -2: represents 0.6x -1: represents 0.8x 0: represents 1.0x (default) 1: represents 1.2x 2: represents 1.5x 6: represents 2.5x For more precise speed control, you can retain two decimal places, such as 0.5/1.25/2.81, etc. For parameter value to actual speed conversion, refer to Speed Conversion
    &quot;Volume&quot;: 5, // Integer Optional, Volume level, range: [0,10], corresponding to 11 levels of volume, default is 0, which represents normal volume.
    &quot;PrimaryLanguage&quot;: 1, // Integer Optional, Primary language 1- Chinese (default) 2- English 3- Japanese
    &quot;FastVoiceType&quot;: &quot;xxxx&quot;   // Optional parameter, Fast VRS parameter
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
For configuration, please refer to the <a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. Note that Minimax TTS has frequency limits, and exceeding the limit may cause response delays, <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit related documentation link</a>.</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS type,
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-yujie&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>Volcano TTS</li>
</ul>
<p>For type of sound quality configuration, refer to the<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">Volcano TTS documentation</a><br>
TTS Sound Quality List - Voice Technology - Volcano Engine<br>
Large Model TTS Sound Quality List - Voice Technology - Volcano Engine</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // Required: String TTS type
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // Required: String Volcano Engine assigned AppId
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // Required: String type Volcano Engine access token
    &quot;Speed&quot; : 1.0,            // Optional parameter: Playback speed, default is 1.0
    &quot;Volume&quot;: 1.0,            // Optional parameter: Volume, default is 1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // Optional parameter: Business cluster, default is volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // Sound quality type, default is the sound quality of the large model TTS. If using normal TTS, fill in the corresponding sound quality type. Incorrect sound quality type will result in no sound.
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
For configuration, refer to the<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">Azure TTS documentation</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // Required: String TTS type
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // Required: String subscription key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // Required: String subscription region
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // Required: String Timbre Name required
    &quot;Language&quot;: &quot;zh-CN&quot;, // Required: String Language for synthesis
    &quot;Rate&quot;: 1 // Optional: float Playback Speed 0.5-2 default is 1
}
</code></pre>

</div></div><ul>
<li>Custom</li>
</ul>
<p>TTS<br>
Please refer to the specific protocol standards in the <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">Tencent documentation</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // Required String
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // Required String for Authentication
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // Required String, TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, optional, expected audio format, such as mp3, ogg_opus, pcm, wav, default is wav, currently only pcm and wav are supported,
  &quot;SampleRate&quot;: 16000,  // Integer, optional, audio sample rate, default is 16000 (16k), recommended value is 16000
  &quot;AudioChannel&quot;: 1,    // Integer, optional, number of audio channels, values: 1 or 2, default is 1
}
</code></pre>

</div></div>
     */
    public void setCustomTTSConfig(String CustomTTSConfig) {
        this.CustomTTSConfig = CustomTTSConfig;
    }

    public CreateAICallRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAICallRequest(CreateAICallRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.LLMType != null) {
            this.LLMType = new String(source.LLMType);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.APIUrl != null) {
            this.APIUrl = new String(source.APIUrl);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
        if (source.WelcomeType != null) {
            this.WelcomeType = new Long(source.WelcomeType);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
        if (source.Languages != null) {
            this.Languages = new String[source.Languages.length];
            for (int i = 0; i < source.Languages.length; i++) {
                this.Languages[i] = new String(source.Languages[i]);
            }
        }
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptSpeechDuration != null) {
            this.InterruptSpeechDuration = new Long(source.InterruptSpeechDuration);
        }
        if (source.EndFunctionEnable != null) {
            this.EndFunctionEnable = new Boolean(source.EndFunctionEnable);
        }
        if (source.EndFunctionDesc != null) {
            this.EndFunctionDesc = new String(source.EndFunctionDesc);
        }
        if (source.NotifyDuration != null) {
            this.NotifyDuration = new Long(source.NotifyDuration);
        }
        if (source.NotifyMessage != null) {
            this.NotifyMessage = new String(source.NotifyMessage);
        }
        if (source.CustomTTSConfig != null) {
            this.CustomTTSConfig = new String(source.CustomTTSConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "LLMType", this.LLMType);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "APIUrl", this.APIUrl);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "WelcomeType", this.WelcomeType);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamSimple(map, prefix + "EndFunctionEnable", this.EndFunctionEnable);
        this.setParamSimple(map, prefix + "EndFunctionDesc", this.EndFunctionDesc);
        this.setParamSimple(map, prefix + "NotifyDuration", this.NotifyDuration);
        this.setParamSimple(map, prefix + "NotifyMessage", this.NotifyMessage);
        this.setParamSimple(map, prefix + "CustomTTSConfig", this.CustomTTSConfig);

    }
}

