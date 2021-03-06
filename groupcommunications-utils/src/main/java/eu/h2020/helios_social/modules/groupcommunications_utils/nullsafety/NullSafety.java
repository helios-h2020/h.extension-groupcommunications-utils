package eu.h2020.helios_social.modules.groupcommunications_utils.nullsafety;

import javax.annotation.Nullable;

@NotNullByDefault
public class NullSafety {

	/**
	 * Stand-in for {@code Objects.requireNonNull()}.
	 */
	public static <T> T requireNonNull(@Nullable T t) {
		if (t == null) throw new NullPointerException();
		return t;
	}

	/**
	 * Checks that exactly one of the arguments is null.
	 *
	 * @throws AssertionError If both or neither of the arguments are null
	 */
	public static void requireExactlyOneNull(@Nullable Object a,
			@Nullable Object b) {
		if ((a == null) == (b == null)) throw new AssertionError();
	}

	/**
	 * Checks that the argument is null.
	 */
	public static void requireNull(@Nullable Object o) {
		if (o != null) throw new AssertionError();
	}
}
