/*
 * Bear - Simple debugging library
 *  Copyright (c) 2022 Joshua Sing
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */
package dev.hypera.bear.header;

import java.time.Instant;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Log header.
 */
public interface Header {

    /**
     * Create an empty {@link Header}.
     *
     * @return new {@link Header}.
     */
    @Contract("-> new")
    static @NotNull Header of() {
        return of(null, null);
    }

    /**
     * Create a new {@link Header} with name and version.
     *
     * @param name    Name.
     * @param version Version.
     *
     * @return new {@link Header}.
     */
    @Contract("_, _ -> new")
    static @NotNull Header of(@Nullable String name, @Nullable String version) {
        return new HeaderImpl(name, version);
    }


    /**
     * Set {@link Header} time.
     *
     * @param instant Time.
     */
    void setTime(@NotNull Instant instant);

}
